import com.ipiecoles.java.java220.Commercial;
import com.ipiecoles.java.java220.Employe;
import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employe employe1 = new Employe("Jules", "Bertrand", "135477", LocalDate.now(), 1480.20);

        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(employe1);
        employes.add(new Commercial());
        for(Employe e : employes){
            System.out.println(e);
        }
    }
}
