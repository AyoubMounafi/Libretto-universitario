package it.unibs.fp.libretto;

public class Esame {
	
	private String nomeMateria;
	private int cfu;
	private int voto;
	
	public Esame(String nomeMateria, int cfu, int voto) {
		
		this.nomeMateria = nomeMateria;
		this.cfu = cfu;
		this.voto = voto;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public String toString() {
		//<nome esame> - CFU
		StringBuilder sb = new StringBuilder();
		sb.append(nomeMateria);
		sb.append(" - CFU: ");
		sb.append(cfu);
		sb.append(" - Voto conseguito: ");
		sb.append(voto);
		return sb.toString();		
	}
}
