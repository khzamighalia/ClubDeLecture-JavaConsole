package club;
import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {
	
	private ArrayList<Bienfaiteur> arrlistbienfaiteur;
	private ArrayList<Livre> arrlistlivre;
	private ArrayList<Lecteur> arrlistlecteur;

	public Bibliotheque() {
		this.arrlistbienfaiteur = new ArrayList<Bienfaiteur>();
		this.arrlistlivre = new ArrayList<Livre>();
		this.arrlistlecteur = new ArrayList<Lecteur>();
	}
	
	/* *************************** Bienfaiteur ***************************************/
	public void ajouterBienfaiteur(String surnom, String mail,int carte_fidelite){
		
		Bienfaiteur b1=new Bienfaiteur(surnom,mail,carte_fidelite);
		this.arrlistbienfaiteur.add(b1);
		System.out.println("Le bienfaiteur a �t� ajout� avec succ�s");
		
	}
	
	public int ChercherBienfaiteur(int identifiant){
		
		    if(this.arrlistbienfaiteur.isEmpty())
		        return -1;

		    else {
		    	for(int i=0;i<this.arrlistbienfaiteur.size();i++) {
		    
		        if(this.arrlistbienfaiteur.get(i).getIdentifiant() == identifiant) {
		        	return i;
		            
		        }
		    }
		    return -1;
		    }
	}
	public void ModifierBienfaiteur(int identifiant,String surnom, String mail,int carte_fidelite) {
		int r=ChercherBienfaiteur(identifiant);
		if(r!=-1) {
			this.arrlistbienfaiteur.get(r).setSurnom(surnom);
			this.arrlistbienfaiteur.get(r).setMail(mail);
			this.arrlistbienfaiteur.get(r).setCarte_fidelite(carte_fidelite);
			System.out.println(" Ce bienfaiteur est modifi� avec succ�s");
		}
		else
			System.out.println(" Cet identifiant n'existe pas");
	
		
	}
	public void supprimerBienfaiteur(int identifiant) {
		int r=ChercherBienfaiteur(identifiant);
		if(r!=-1) {
			this.arrlistbienfaiteur.remove(r);
			Bienfaiteur.id--;
			System.out.println(" Ce bienfaiteur est supprim� avec succ�s");
		}
			else
				System.out.println(" Cet identifiant n'existe pas");
			
			}
	public void AfficherBienfaiteur(int identifiant) {
		int i=ChercherBienfaiteur(identifiant);
		if(i!=-1) {
	System.out.println(" Surnom : "+arrlistbienfaiteur.get(i).getSurnom()+ ", Mail : "+arrlistbienfaiteur.get(i).getMail()+", Carte fidelit� : "+arrlistbienfaiteur.get(i).getCarte_fidelite());
			
		}
		else
			System.out.println(" Cet identifiant n'existe pas");
	
		
	}
	
	
	public void AfficherBienfaiteurs() {
		int cf=0;
		String type;
		if(!this.arrlistbienfaiteur.isEmpty()) {
		for(int i=0;i<this.arrlistbienfaiteur.size();i++) {
	        if(this.arrlistbienfaiteur.get(i).getCarte_fidelite()>= 3) {
	        	cf++;
	        	type="super-fid�le";
	        }
	        else {
	        	type="normal";
	        }
		System.out.println(" Surnom : "+arrlistbienfaiteur.get(i).getSurnom()+ ", Mail : "+arrlistbienfaiteur.get(i).getMail()+", Carte fidelit� : "+arrlistbienfaiteur.get(i).getCarte_fidelite()+", type : "+type);
	}
	System.out.println("Le nombre des bienfaiteurs est : "+this.arrlistbienfaiteur.size());
	System.out.println("Le nombre des bienfaiteurs super-fid�le est : "+cf);
		}
		else System.out.println(" La liste des bienfaiteurs est vide "); 
	}
	
	public void MenuBienfaiteur() {
		Scanner reader = new Scanner(System.in);
		int a;

		do {
			System.out.println("1 : Ajouter bienfaiteur ");
			System.out.println("2 : Modifier bienfaiteur ");
			System.out.println("3 : Supprimer bienfaiteur ");
			System.out.println("4 : Afficher les bienfaiteurs ");
			System.out.println("5 : Chercher  bienfaiteur ");
			System.out.println("0 : Retour au programme pricipal ");
			a=reader.nextInt();
			
			switch(a) {
			case 1 : {
				System.out.println("Entrez le surnom : ");
				reader.nextLine();
			    String surnom=reader.nextLine();
				System.out.println("Entrez le mail ");
				String mail=reader.nextLine();
				System.out.println("Entrez la carte fid�lit� ");
				int carte_fidelite=reader.nextInt();
				this.ajouterBienfaiteur(surnom,mail,carte_fidelite);
	            break;	
			}
			case 2: {
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
			    System.out.println("Entrez le nouveau  surnom : ");
				reader.nextLine();
			    String surnom=reader.nextLine();
				System.out.println("Entrez le nouveau  mail ");
				String mail=reader.nextLine();
				System.out.println("Entrez la nouvelle carte fid�lit� ");
				int carte_fidelite=reader.nextInt();
				this.ModifierBienfaiteur(id,surnom,mail,carte_fidelite);
	            break;
			}
			case 3: {
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
				this.supprimerBienfaiteur(id);
	            break;
			}
			case 4: {
				this.AfficherBienfaiteurs();
				
	            break;
			}
			
			case 5 :{
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
				this.AfficherBienfaiteur(id);
			}
			
			default :{
				System.out.println(" Entrez un nombre valide ");
				break;
			}
			}
			
			}while(a!=0);
					}
	
/* ************************* Livre *****************************************/
	public void ajouterLivre(String titre, String edition,String date_edition){
		
		Livre l1=new Livre(titre,edition,date_edition);
		this.arrlistlivre.add(l1);
		System.out.println("Le livre a �t� ajout� avec succ�s");
		
	}
	public int ChercherLivre(int identifiant) {
		
		    if(this.arrlistlivre.isEmpty()) {
		        return -1;
		    }

		    else {for(int i=0;i<this.arrlistlivre.size();i++) {
		        if(this.arrlistlivre.get(i).getIdentifiant() == identifiant) {
		        	return i;
		            
		        }
		    }
		    return -1;
}
	}
	public void ModifierLivre(int identifiant,String titre, String edition,String date_edition) {
		int r=ChercherLivre(identifiant);
		if(r!=-1) {
			this.arrlistlivre.get(r).setTitre(titre);
			this.arrlistlivre.get(r).setEdition(edition);
			this.arrlistlivre.get(r).setDate_edition(date_edition);
			System.out.println(" Ce livre est modifi� avec succ�s");
		}
		else
			System.out.println(" Cet identifiant n'existe pas");
	
		
	}
	public void supprimerLivre(int identifiant) {
		int r=ChercherLivre(identifiant);
		if(r!=-1) {
			this.arrlistlivre.remove(r);
			Livre.id--;
			System.out.println(" Ce livre est supprim� avec succ�s");
		}
			else
				System.out.println(" Cet identifiant n'existe pas");
			
			}
	public void AfficherLivre(int identifiant) {
		int i=ChercherLivre(identifiant);
		if(i!=-1) {
	System.out.println(" Titre : "+arrlistlivre.get(i).getTitre()+ ", Edition : "+arrlistlivre.get(i).getEdition()+", Date Edition : "+arrlistlivre.get(i).getDate_edition());
			
		}
		else
			System.out.println(" Cet identifiant n'existe pas");
	
		
	}
	
	
	public void AfficherLivres() {
		if(!this.arrlistlivre.isEmpty()) {
		for(int i=0;i<this.arrlistlivre.size();i++) 
		System.out.println(" Tite : "+arrlistlivre.get(i).getTitre()+ ", Edition : "+arrlistlivre.get(i).getEdition()+", Date Edition : "+arrlistlivre.get(i).getDate_edition());
	System.out.println("Le nombre des livres disponibles est : "+Livre.id);
		}
		else System.out.println(" La liste des livres est vide "); 
	}
	
	public void MenuLivre() {
		Scanner reader = new Scanner(System.in);
		int a;

		do {
			System.out.println("1 : Ajouter livre ");
			System.out.println("2 : Modifier livre ");
			System.out.println("3 : Supprimer livre ");
			System.out.println("4 : Afficher les livres ");
			System.out.println("5 : Chercher  un livre ");
			System.out.println("0 : Retour au programme pricipal ");
			a=reader.nextInt();
			
			switch(a) {
			case 1 : {
				System.out.println("Entrez le titre : ");
				reader.nextLine();
			    String titre=reader.nextLine();
				System.out.println("Entrez l'�dition ");
				String edition=reader.nextLine();
				System.out.println("Entrez la date d'�dition ");
				String date_edition=reader.nextLine();
				this.ajouterLivre(titre,edition,date_edition);
	            break;	
			}
			case 2: {
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
			    System.out.println("Entrez le nouveau  titre : ");
				reader.nextLine();
			    String titre=reader.nextLine();
				System.out.println("Entrez le nouvelle �dition ");
				String edition=reader.nextLine();
				System.out.println("Entrez la nouvelle date d'�dition ");
				String date_edition=reader.nextLine();
				this.ModifierLivre(id,titre,edition,date_edition);
	            break;
			}
			case 3: {
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
				this.supprimerLivre(id);
	            break;
			}
			case 4: {
				this.AfficherLivres();
				
	            break;
			}
			
			case 5 :{
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
				this.AfficherLivre(id);
			}
			default :{
				System.out.println(" Entrez un nombre valide ");
				break;
			}
			}
			
			}while(a!=0);

		}
	
	/* ************************* Lecteur *****************************************/
	public void ajouterLecteur(String nom, String prenom, String num_tel, String mail, int carte_fidelite){
		
		Lecteur l1= new Lecteur(nom,prenom,num_tel,mail,carte_fidelite);
		this.arrlistlecteur.add(l1);
		System.out.println("Le lecteur a �t� ajout� avec succ�s");
	}
	public int ChercherLecteur(int identifiant) {
		
		    if(this.arrlistlecteur.isEmpty()) {
		        return -1;
		    }

		    else {for(int i=0;i<this.arrlistlecteur.size();i++) {
		        if(this.arrlistlecteur.get(i).getIdentifiant() == identifiant) {
		        	return i;
		            
		        }
		    }
		    return -1;
}
	}
	public void ModifierLecteur(int identifiant, String nom, String prenom, String num_tel, String mail, int carte_fidelite) {
		int r=ChercherLecteur(identifiant);
		if(r!=-1) {
			this.arrlistlecteur.get(r).setNom(nom);
			this.arrlistlecteur.get(r).setPrenom(prenom);
			this.arrlistlecteur.get(r).setNum_tel(num_tel);
			this.arrlistlecteur.get(r).setMail(mail);
			this.arrlistlecteur.get(r).setCarte_fidelite(carte_fidelite);
			System.out.println(" Ce lecteur est modifi� avec succ�s");
		}
		else
			System.out.println(" Cet identifiant n'existe pas");
	
		
	}
	public void supprimerLecteur(int identifiant) {
		int r=ChercherLecteur(identifiant);
		if(r!=-1) {
			this.arrlistlecteur.remove(r);
			Lecteur.id--;
			System.out.println(" Ce lecteur est supprim� avec succ�s");
		}
			else
				System.out.println(" Cet identifiant n'existe pas");
			
			}
	public void AfficherLecteur(int identifiant) {
		int i=ChercherLecteur(identifiant);
		if(i!=-1) {
	System.out.println(" Nom : "+arrlistlecteur.get(i).getNom()+" Prenom : "+arrlistlecteur.get(i).getPrenom()+ ", Num�ro de t�l�phone : "+arrlistlecteur.get(i).getNum_tel()+", Mail : "+arrlistlecteur.get(i).getMail());
			
		}
		else
			System.out.println(" Cet identifiant n'existe pas");
	
		
	}
	
	
	public void AfficherLecteurs() {
			int cf=0;
		String type;
		if(!this.arrlistlecteur.isEmpty()) {
		for(int i=0;i<this.arrlistlecteur.size();i++) {
			   if(this.arrlistlecteur.get(i).getCarte_fidelite()>= 4) {
		        	cf++;
		        	type="fid�le";
		        }
		        else {
		        	type="normal";
		        }
		System.out.println(" Nom : "+this.arrlistlecteur.get(i).getNom()+" Prenom : "+arrlistlecteur.get(i).getPrenom()+ ", Num�ro de t�l�phone : "+arrlistlecteur.get(i).getNum_tel()+", Mail : "+arrlistlecteur.get(i).getMail()+", type : "+type);
	System.out.println("Le nombre des lecteurs disponibles est : "+Lecteur.id);
	System.out.println("Le nombre des lecteurs fid�les est : "+cf);
		}
		
	}
		else System.out.println(" La liste des lecteurs est vide "); }
	
	public void MenuLecteur() {
		Scanner reader = new Scanner(System.in);
		int a;

		do {
			System.out.println("1 : Ajouter lecteur ");
			System.out.println("2 : Modifier lecteur ");
			System.out.println("3 : Supprimer lecteur ");
			System.out.println("4 : Afficher lecteur ");
			System.out.println("5 : Chercher  un lecteur ");
			System.out.println("0 : Retour au programme pricipal ");
			a=reader.nextInt();
			
			switch(a) {
			case 1 : {
				System.out.println("Entrez le nom: ");
				reader.nextLine();
			    String nom=reader.nextLine();
			    System.out.println("Entrez le pr�nom: ");
			    String prenom=reader.nextLine();
				System.out.println("Entrez le num�ro de t�l�phone ");
				String num_tel=reader.nextLine();
				System.out.println("Entrez le mail ");
				String mail=reader.nextLine();
				System.out.println("Entrez le nombre des livres lus ");
				int carte_fidelite=reader.nextInt();
				this.ajouterLecteur(nom,prenom,num_tel,mail,carte_fidelite);
	            break;	
			}
			case 2: {
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
			    System.out.println("Entrez le nom: ");
				reader.nextLine();
			    String nom=reader.nextLine();
			    System.out.println("Entrez le pr�nom: ");
			    String prenom=reader.nextLine();
				System.out.println("Entrez le num�ro de t�l�phone ");
				String num_tel=reader.nextLine();
				System.out.println("Entrez le mail ");
				String mail=reader.nextLine();
				System.out.println("Entrez le nombre des livres lus ");
				int carte_fidelite=reader.nextInt();
				this.ModifierLecteur(id,nom,prenom,num_tel,mail,carte_fidelite);
	            break;
			}
			case 3: {
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
				this.supprimerLecteur(id);
	            break;
			}
			case 4: {
				this.AfficherLecteurs();
				
	            break;
			}
			
			case 5 :{
				System.out.println("Entrez l'identifiant: ");
			    int id=reader.nextInt();
				this.AfficherLecteur(id);
			}
			default :{
				System.out.println(" Entrez un nombre valide ");
				break;
			}
			
			}
		}while(a!=0);
	}
	
	public void menuPrincipal() {
		Scanner reader = new Scanner(System.in);
		int a;

		do {
			System.out.println("1 : Livre ");
			System.out.println("2 : Lecteur");
			System.out.println("3 : Bienfaiteur ");
			System.out.println("0 : Quitter le programme pricipal ");
			a=reader.nextInt();
			

		switch(a) {
		case 0 : {
			System.out.println(" Vous avez quitt� le programme");
            break;	
		}
		case 1 : {
			MenuLivre();
            break;	
		}
		case 2: {
			MenuLecteur();
            break;
		}
		case 3: {
			MenuBienfaiteur();
            break;
		}
		
		default :{
			System.out.println(" Entrez un nombre valide ");
			break;
		}
		
		
	}
	}while(a!=0);
	}
}

