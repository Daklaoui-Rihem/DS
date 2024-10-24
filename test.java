package DS;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println("\n     Pépinière GREEN HANDS");
		    Pepiniere pépinière = new Pepiniere();
		    Fleur rose = new Fleur(null, 30., 12, 15.99, "Rouge", 2);
		    Fleur tulipe = new Fleur("Tulipe", 20., 8, 12.99, "Jaune", 4);
		    Arbre chêne = new Arbre("Chêne", 200., 60, 89.99, "Caduque");
		    Arbre sapin = new Arbre("Sapin", 150., 30, 59.99, "Persistant");
		    rose.setNom("Rose");
		    System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());
		    pépinière.ajoutPlante(rose);
		    pépinière.ajoutPlante(tulipe);
		    pépinière.ajoutPlante(chêne);
		    pépinière.ajoutPlante(sapin);
		    pépinière.afficheInventaire();
		    System.out.println("Total Absorption CO2: " + pépinière.totalAbsorptionTotaleCO2());
		    System.out.println("Nombre d'arbres Caduques dans la pépinière: " + pépinière.compterArbresCaduques());
		}

	}

