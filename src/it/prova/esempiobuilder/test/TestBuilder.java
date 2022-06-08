package it.prova.esempiobuilder.test;

import it.prova.esempiobuilder.model.User;
import it.prova.esempiobuilder.model.UserBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserBuilder primoUserBuilder = UserBuilder.newBuilder()
			.id(1L)
			.nome("Andrea")
			.cognome("Verace")
			.nickname("andver")
			.password("andrea")
			.eta(23)
			.isRegistrato(true)
			.sesso(User.Sesso.MASCHIO);
			
		
		User primoUser = primoUserBuilder.build();
		User secondoUserClonatoDalPrimo = primoUserBuilder.build();
		User terzoUserModificatoDalPrimo = primoUserBuilder
				.id(10L)
				.nome("Giacomo")
				.cognome("Poretti")
				.nickname("giakporo")
				.password("giacomino82")
				.eta(40)
				.isRegistrato(true)
				.sesso(User.Sesso.MASCHIO)
				.build();
		
		System.out.println("Primo User dati: " + primoUser + "\n" 
							+ "Secondo User dati: " + secondoUserClonatoDalPrimo + "\n"
							+ "Terzo User dati: " + terzoUserModificatoDalPrimo);
		
		
		//-----------------------------------------------------------
		
		User userSenzaAlcuniParametri = UserBuilder.newBuilder()
				.id(2L)
				.nome("Aldo")
				.cognome("Baglio")
				.build();
		
		System.out.println(userSenzaAlcuniParametri);
		
		
		// provo a inserire user con età negativa
		
		User userEtaNegativa = UserBuilder.newBuilder()
				.eta(-5)
				.build();
		
		System.out.println(userEtaNegativa);
	}

}
