package it.unibs.fp.libretto;

import java.util.ArrayList;
import java.util.Iterator;

public class Libretto {

	public static final String A_CAPO = "\n";
	public static final String MSG_NO_ESAMI = "Non ci sono esami!";
	private ArrayList<Esame> esamiSuperati;

	
	public Libretto() {
		this.esamiSuperati = new ArrayList<Esame>();
	}
	
	public void aggiungiEsami(Esame e) {
		this.esamiSuperati.add(e);
	}
	
	public double calcolaMediaPonderata() {
		if(esamiSuperati.isEmpty())
			return 0;
		else {
			int cfuTotali = 0;
			int sommaPesata = 0;
			for(Esame ex: esamiSuperati) {
				cfuTotali = cfuTotali + ex.getCfu();
				sommaPesata = sommaPesata + ex.getVoto()*ex.getCfu();
			}
			double mediaPonderata = (double)sommaPesata/cfuTotali;
			return mediaPonderata;
		}
	}
	
	public boolean eStatoSuperato(String nome) {
		boolean superato=false;
		Iterator<Esame> it = esamiSuperati.iterator();
		while(it.hasNext()) {
			Esame e = it.next();
			if(e.getNomeMateria().equalsIgnoreCase(nome))
				superato = true;
		}
		return superato;
	}
	
	public void eliminaEsame(String nome) {
		if(eStatoSuperato(nome)) {
			Iterator<Esame> it = esamiSuperati.iterator();
			while(it.hasNext()) {
				Esame ex = it.next();
				if(ex.getNomeMateria().equalsIgnoreCase(nome)) {
					it.remove();
				}
			}
		}
	}
	
	public ArrayList<Esame> trovaEsamiPerVoto(int soglia) {
		ArrayList<Esame> risultato = new ArrayList<Esame>();
		for(Esame e: esamiSuperati) {
			if(e.getVoto()>=soglia)
				risultato.add(e);
		}
		return risultato;
	}
	
	public void eliminaEsamiPerVoto(int soglia) {
		Iterator<Esame> it = esamiSuperati.iterator();
		while(it.hasNext()) {
			Esame e = it.next();
			if(e.getVoto()<soglia)
				it.remove();
		}
	}
	
	
	
	public ArrayList<Esame> getEsamiSuperati() {
		return esamiSuperati;
	}

	public void setEsamiSuperati(ArrayList<Esame> esamiSuperati) {
		this.esamiSuperati = esamiSuperati;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(esamiSuperati.isEmpty()) {
			sb.append(MSG_NO_ESAMI);
		} 
		else {
			for(int i = 0; i < esamiSuperati.size(); i++) {
				Esame e = esamiSuperati.get(i);
				sb.append(e.toString());
				sb.append(A_CAPO);
			}
		}
		return sb.toString();
	}
	
}
