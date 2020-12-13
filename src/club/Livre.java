package club;

public class Livre {

	private int identifiant;
	private String titre; 
	private String edition;
	private String date_edition;
	static int id;
	
	public Livre(String titre, String edition,String date_edition) {
		super();
		this.identifiant = ++id;
		this.titre = titre;
		this.edition = edition;
		this.date_edition = date_edition;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getDate_edition() {
		return date_edition;
	}

	public void setDate_edition(String date_edition) {
		this.date_edition = date_edition;
	}
	
	
	
	
	}
