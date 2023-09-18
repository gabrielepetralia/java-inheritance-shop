package org.lessons.java.shop;

public class Smartphone extends Prodotto{
	private String imei;
	private int memoria;
	
	public Smartphone(
			String codice, String nome, String marca, float prezzo, int iva,
			String codiceImei, int memoria
		) {
	
		super(codice, nome, marca, prezzo, iva);
		
		setImei(imei);
		setMemoria(memoria);
	};
	
	public String getImei() {
		return imei;
	};
	
	public int getMemoria() {
		return memoria;
	};
	
	public void setImei(String imei) {
		this.imei = imei;
	};
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	};
	
	@Override
	public Float getPrezzoScontato() {
		if(getMemoria()<32) {
			return getPrezzo() - (getPrezzo() /100 * 5);
		} else {
			return super.getPrezzoScontato();
		}
	}
	
	@Override
	public String toString() {	
		return super.toString() + " | IMEI: " + getImei() + " | Memoria: " + getMemoria() + "GB";
	}
}
