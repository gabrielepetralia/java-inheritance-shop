package org.lessons.java.shop;

public class Televisore extends Prodotto{
	private float dimensioni;
	private boolean smart;
	
	public Televisore(
			String codice, String nome, String marca, float prezzo, int iva,
			float dimensioni, boolean smart
		) {
	
		super(codice, nome, marca, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmart(smart);
	};
	
	public float getDimensioni() {
		return dimensioni;
	};
	
	public boolean isSmart() {
		return smart;
	};
	
	public void setDimensioni(float dimensioni) {
		this.dimensioni = dimensioni;
	};
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	};
	
	@Override
	public Float getPrezzoScontato() {
		if(!isSmart()) {
			return getPrezzo() - (getPrezzo() /100 * 10);
		} else {
			return super.getPrezzoScontato();
		}
	}
	
	@Override
	public String toString() {	
		return super.toString() + " | Dimensioni: " + getDimensioni() + "\"" + " | Smart: " + (isSmart() ? "si" : "no");
	}
}
