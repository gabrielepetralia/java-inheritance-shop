package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;
	
	public Cuffie(
			String codice, String nome, String marca, float prezzo, int iva,
			String colore, boolean wireless
		) {
	
		super(codice, nome, marca, prezzo, iva);
		
		setColore(colore);
		setWireless(wireless);
	};
	
	public String getColore() {
		return colore;
	};
	
	public boolean isWireless() {
		return wireless;
	};
	
	public void setColore(String colore) {
		this.colore = colore;
	};
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	};
	
	
	@Override
	public Float getPrezzoScontato() {
		if(!isWireless()) {
			return getPrezzo() - (getPrezzo() /100 * 7);
		} else {
			return super.getPrezzoScontato();
		}
	}
	
	@Override
	public String toString() {	
		return super.toString() + " | Colore: " + getColore() + " | Wireless: " + (isWireless() ? "si" : "no");
	}
}

