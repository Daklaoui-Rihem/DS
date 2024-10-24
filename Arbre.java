package DS;

public class Arbre extends Plante{
	private String type_Feuillage;
	final private Double AbsorMoyenne=22.;
	
	public Arbre(String nom,Double hauteur,int age,Double prix,String type_Feuillage)
	{
		super(nom,hauteur,age,prix);
		this.type_Feuillage=type_Feuillage;
	}

	public String getType_Feuillage() {
		return type_Feuillage;
	}

	public void setType_Feuillage(String type_Feuillage) {
		this.type_Feuillage = type_Feuillage;
	}

	public Double getAbsorMoyenne() {
		return AbsorMoyenne;
	}

	@Override
	public String toString() {
		return "Arbre [type_Feuillage=" + type_Feuillage + ", AbsorMoyenne=" + AbsorMoyenne + "]";
	}
	
	public void description()
	{
		System.out.println(getClass().getSimpleName());
		System.out.println(super.toString());
		System.out.println(this);
	}
	
	public Double absorptionCO2()
	{
		if(hauteur>50)
		{
			return AbsorMoyenne+3;
		}
		else
		{
			return AbsorMoyenne;
		}
	}
}
