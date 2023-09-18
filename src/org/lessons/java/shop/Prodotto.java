package org.lessons.java.shop;

public class Prodotto {
	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto(String codice, String nome, String marca, float prezzo, int iva) {
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	};
	
	// Getter
	public String getCodice() {
		return codice;
	};
	
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	// Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	};
	
	// Others 
	public String getPrezzoConIva() {
		float prezzoConIva = (prezzo + ((prezzo/100) * iva));
		String prezzoConIvaFormattato = String.format("%.02f", prezzoConIva);
		return prezzoConIvaFormattato;
	}
	
	@Override
	public String toString() {
		return "Codice: " + getCodice() + " | Nome: " + getNome() + " | Marca: " + getMarca() + " | Prezzo base: €" + getPrezzo() + " | Prezzo con IVA: €" + getPrezzoConIva();
	}
}
