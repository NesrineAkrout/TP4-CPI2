package Exercice3;

public interface Exportable {
	default double defaultMethod(double prix, double qte) {
		return prix * qte;
		}
		 double prixNet(double fraisDouane);
		static void afficherMontant(double montant) {
		System.out.println("Montant est :" + montant);
		}
		
}
