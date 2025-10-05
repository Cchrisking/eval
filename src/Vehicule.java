package course;
public class Vehicule {
    private String nom;
    private double  vitesse_max ;
    private int poids;
    int niveau_carb;
    public Vehicule(){
        nom = "Anonyme";
        vitesse_max = 130;
        poids = 1000;
        niveau_carb = 0;
    }
    public Vehicule(String nom,double vitesseMax,int poids,int niveau_carb){
        this.nom = nom;
        this.vitesse_max = vitesseMax;
        this.poids = poids;
        this.niveau_carb = niveau_carb;
    }
    public String toString() {
        return nom+" ->  vitesse max = "+vitesse_max+" km/h, poids = "+poids+" kg";
    }
    public double performance(){
        return vitesse_max/poids;
    }
    public boolean meilleur(Vehicule autreVehicule){
        return this.performance() >= autreVehicule.performance();
    }
    public boolean estDeuxroux(){

        return false;
    }
}
