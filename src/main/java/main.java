
import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Repo repo = new Repo();
        Service service = new Service();
        try {
            List<Unternehmen> listeTiere = repo.readFromFile("A:\\facultate\\MAP\\PRACTIC Coltanel Eusebiu 721\\1\\src\\main\\java\\kundendaten.txt.", ",");

            System.out.println(service.sortListByAnzahl_Mitarbeiter(listet));
            System.out.println(service.writeStatisticTopOrte(liste, EK));

            repo.writeToFile("A:\\facultate\\MAP\\PRACTIC Coltanel Eusebiu 721\\1\\src\\main\\java\\kundensortiert.txt", listeTiere, "%");
            service.writeStatisticTopOrte(listeTiere);
            System.out.println(service.writeStatisticTopOrte(liste));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}
