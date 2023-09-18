package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1] Smartphone - [2] Televisore - [3] Cuffie - [4] Esci ->");
			System.out.print("\nScegli un prodotto da aggiungere al carrello: ");
			
			String choice = sc.nextLine();
			
			if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
				sc.close();
				System.out.println("\n==============================\n");
				System.out.println("Arrivederci!");
				return;
			}
			
			int iva = 22;
			// trasformare in static final nella classe
			
			Random rnd = new Random();
			
			String codice = "";
			String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			
			for(int j=0; j<10; j++) {
				codice += chars.charAt(rnd.nextInt(chars.length()));
			}
			
			System.out.print("\nInserisci il nome del prodotto: ");
			String nome = sc.nextLine();
			System.out.print("Inserisci la marca: ");
			String marca = sc.nextLine();
			System.out.print("Inserisci il prezzo: ");
			String prezzo = sc.nextLine();
			
			switch (choice) {
				case "1":
					System.out.print("Inserisci il codice IMEI: ");
					String imei = sc.nextLine();
					System.out.print("Inserisci i GB di memoria: ");
					String memoria = sc.nextLine();
					
					Smartphone s = new Smartphone(codice, nome, marca, Float.parseFloat(prezzo), iva, imei, Integer.parseInt(memoria) );
					
					System.out.println("\nDettagli prodotto: ");
					System.out.println(s.toString());
					System.out.println("\n==============================\n");
					break;
				case "2":
					System.out.print("Inserisci le dimensioni in pollici: ");
					String dimensioni = sc.nextLine();
					System.out.print("Inserisci '1' se è smart o '0' se non lo è: ");
					String smart = sc.nextLine();
					
					Televisore t = new Televisore(codice, nome, marca, Float.parseFloat(prezzo), iva, Integer.parseInt(dimensioni), smart.equals("1") );
					
					System.out.println("\nDettagli prodotto: ");
					System.out.println(t.toString());
					System.out.println("\n==============================\n");
					break;
				case "3":
					System.out.print("Inserisci il colore: ");
					String colore = sc.nextLine();
					System.out.print("Inserisci '1' se sono wireless o '0' se non lo sono: ");
					String wireless = sc.nextLine();
					
					Cuffie c = new Cuffie(codice, nome, marca, Float.parseFloat(prezzo), iva, colore, wireless.equals("1") );
					
					System.out.println("\nDettagli prodotto: ");
					System.out.println(c.toString());
					System.out.println("\n==============================\n");
					break;
			}
		}
	}
}
