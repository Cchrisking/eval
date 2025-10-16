package course;
public class Voiture extends Vehicule{
    String categorie;
    public Voiture(String nom,double vitesseMax,int poids,int niveau_carb){
        super(nom, vitesseMax, poids, niveau_carb);
    }
    public Voiture(String nom,double vitesseMax,int poids,int niveau_carb, String categorie){
        super(nom, vitesseMax, poids, niveau_carb);
        this.categorie = categorie;
    }
    public String toString(){
        return super.toString()+" de categorie "+categorie;
    }
    public String getCategorie(){
        return categorie;
    }
}
