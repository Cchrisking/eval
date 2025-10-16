package course;
import java.util.ArrayList;
import java.util.List;
public class GrandPrix extends Rellye{
    List<Vehicule> vehicules = new ArrayList<>();
    @Override
    public boolean check() {
        boolean vehicule= false;
        boolean deuxroues = false;
        for (Vehicule v : vehicules) {
            if (v.estDeuxRoues()){
                deuxroues = true;
            }else{
                vehicule = true;
            }
            if (deuxroues && vehicule){
                return false;
            }
        }
        return true;
    }
    public void ajouter(Vehicule vehicule){
        vehicules.add(vehicule);
    }
    void run(int tours){
        List<Vehicule> arrivees = new ArrayList<>();
        int meilleur = 0;
        if (!check()){
            System.out.println("Pas de Grand prix");
            return;
        }
        else{
            for(int i=0; i<vehicules.size(); i++){
                vehicules.get(i).setNiveauCarb( vehicules.get(i).getNiveauCarb() -tours);
                if(vehicules.get(i).getNiveauCarb()>0){
                    arrivees.add(vehicules.get(i));
                    System.out.println("Arrivees: "+vehicules.get(i));
                }
            }
            for(int i=0; i<arrivees.size(); i++){
                if(!arrivees.get(meilleur).meilleur(arrivees.get(i))){
                    meilleur =i;
                }
            }
        }
       System.out.println("Meilleur: " + arrivees.get(meilleur)+" "+arrivees.get(meilleur).performance());
    }
}