package DS;

public class Fleur extends Plante{
	private String couleur;
	private int moisF;
	
	public Fleur(String nom,Double hauteur,int age,Double prix,String couleur,int moisF)
	{
		super(nom,hauteur,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getMoisF() {
		return moisF;
	}

	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}

	@Override
	public String toString() {
		return "Fleur [couleur=" + couleur + ", moisF=" + moisF + "]";
	}
	
	public void description()
	{
		System.out.println(getClass().getSimpleName());
		System.out.println(super.toString());
		System.out.println(this);
	}
	
	public void fleurir()
	{
		if(moisF>=4 && moisF<=6)
		{
			System.out.println("C'est une fleur");
		}
		else
		{
			System.out.println("Ce n'est pas une fleur");
		}
	}
}
