package course;
import java.util.ArrayList;
import java.util.List;

public class GrandPrix extends Rellye{
    List<Vehicule> vehicules = new ArrayList<>();
    @Override
    public boolean check() {
        return false;
    }
    public void ajouter(Vehicule vehicule) {
        vehicules.add(vehicule);
    }
    void run(int tours){

    }
}
