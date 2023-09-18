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
	public String toString() {	
		return super.toString() + " | IMEI: " + getImei() + " | Memoria: " + getMemoria() + "GB";
	}
}
