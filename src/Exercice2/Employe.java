package Exercice2;

public abstract class Employe {
	    private String nom;
	    private String prenom;
	    private int age;
	    private String date;
	 
	 
	    public Employe(String prenom, String nom, int age, String date) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	        this.date = date;
	    }
	 
	    public abstract double calculerSalaire();
	    
	    public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getnom() {
	        return  nom;
	    }
		public String getNom() {
	        return  "L'employé"+ prenom + " " + nom;
	    }
	}

