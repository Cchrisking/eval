package course;
public class Moto extends Vehicule{
    private boolean sidecar;
    public Moto(String nom,double vitesseMax,int poids,int niveau_carb, boolean sidecar) {
        super(nom,vitesseMax,poids,niveau_carb);
        this.sidecar = sidecar;
    }
    public Moto(String nom,double vitesseMax,int poids,int niveau_carb) {
        super(nom,vitesseMax,poids,niveau_carb);
    }
    public boolean esDeuxroux(){
        return sidecar;
    }
}
