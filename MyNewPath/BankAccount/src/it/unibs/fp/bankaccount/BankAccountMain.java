package it.unibs.fp.bankaccount;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class BankAccountMain {

	private static final String MSG_RICHIESTA_SALDO = "Inserire il saldo iniziale: ";
	private static final String MESG_RICHIESTA_NOME = "Inserire nome dell'intestatario: ";
	private static final String MSG_BENVENUTO = "Benvenuto nell'applicazione";
	
	private static final String[] VOCI_MENU = {"Preleva", "Deposita"};
	private static final String TITOLO_MENU = "Gestione BankAccount";

	public static void main(String[] args) {
		//Presentare un saluto iniziale
		System.out.println(MSG_BENVENUTO);
		//Creare un BankAcoount
		BankAccounto mioConto = createBankAccount();
		//Gestione interazione con l'utente
		MyMenu menu = new MyMenu(TITOLO_MENU, VOCI_MENU);
		int scelta = menu.scegli();
		while(scelta!=0) {
			if(scelta==1) {
				//gestire il prelievo
				double daPrelevare = InputDati.leggiDoubleConMinimo("Quanto vuoi prelevare?", 0);
				mioConto.whitdraw(daPrelevare);
			}
			if (scelta==2) {
				//gestire il deposito
				double daVersare = InputDati.leggiDoubleConMinimo("Quanto vuoi versare?", 0);
				mioConto.whitdraw(daVersare);
				
			}
			System.out.println(mioConto.toString());
			scelta = menu.scegli();
		}
		//Presentare un saluto iniziale
		System.out.println("Arrivederci");
	}

	public static BankAccounto createBankAccount() {
		String owner = InputDati.leggiStringaNonVuota(MESG_RICHIESTA_NOME);
		double saldoIniziale = InputDati.leggiDoubleConMinimo(MSG_RICHIESTA_SALDO, 0);
		return new BankAccounto(owner,saldoIniziale);
	}
}
