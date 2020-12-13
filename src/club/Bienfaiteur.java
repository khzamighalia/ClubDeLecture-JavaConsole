package club;

public class Bienfaiteur {

	 private int identifiant;
	 private String surnom; 
	 private String mail;
	 private int carte_fidelite;
	 public static int id=0;
	 
	public Bienfaiteur(String surnom, String mail,int carte_fidelite) {
		this.identifiant = ++id;
		this.surnom = surnom;
		this.mail = mail;
		this.carte_fidelite = carte_fidelite;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getCarte_fidelite() {
		return carte_fidelite;
	}

	public void setCarte_fidelite(int carte_fidelite) {
		this.carte_fidelite = carte_fidelite;
	}
	 
	
	 

	 
	 
}
