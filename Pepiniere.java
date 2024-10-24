package DS;

public class Pepiniere {
	private Plante[] inventaire;
	final private int max=1000;
	private int nbplante=0;
	
	public Pepiniere()
	{
		inventaire=new Plante[max];
	}
	
	public void ajoutPlante(Plante plante)
	{
		if(nbplante>=max)
		{
			System.out.println("Le tableau est plein");
		}
		else
		{
			inventaire[nbplante]=plante;
			nbplante++;
		}
	}
	
	public void afficheInventaire()
	{
		int i;
		for(i=0;i<nbplante;i++)
		{
			inventaire[i].description();
			if(inventaire[i] instanceof Fleur)
			{
				((Fleur)inventaire[i]).fleurir();
			}
		}
	}

	public Double totalAbsorptionTotaleCO2()
	{
		Double s=0.;
		for(int i=0;i<nbplante;i++)
		{
			if(inventaire[i] instanceof Arbre)
			{
				s+=((Arbre)inventaire[i]).absorptionCO2();
			}
		}
		return s;
	}
	
	public int compterArbresCaduques()
	{
		int s=0;
		for(int i=0;i<nbplante;i++)
		{
			if(inventaire[i] instanceof Arbre)
			{
				if(((Arbre)inventaire[i]).getType_Feuillage().equalsIgnoreCase("caduque")) 
				{
					s++;
				}
				
			}
		}
		return s;
	}
}
