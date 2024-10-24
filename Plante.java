package DS;

public class Plante {
	protected String nom;
	protected Double hauteur;
	protected int age;
	protected Double prix;
	
	public Plante(String nom,Double hauteur,int age,Double prix)
	{
		this.nom=nom;
		this.hauteur=hauteur;
		this.age=age;
		this.prix=prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getHauteur() {
		return hauteur;
	}
	public void setHauteur(Double hauteur) {
		this.hauteur = hauteur;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Plante [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
	}
	
	public void description()
	{
		System.out.println(this);
	}
}
