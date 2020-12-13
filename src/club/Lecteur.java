package club;

public class Lecteur {

	private int identifiant;
	private String nom;
	private String prenom; 
	private String num_tel; 
	private String mail;
	private int carte_fidelite;
	static int  id=0;
	public Lecteur(String nom, String prenom, String num_tel, String mail, int carte_fidelite) {
		this.identifiant = ++id;
		this.nom = nom;
		this.prenom = prenom;
		this.num_tel = num_tel;
		this.mail = mail;
		this.carte_fidelite = carte_fidelite;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
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
