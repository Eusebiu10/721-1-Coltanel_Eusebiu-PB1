import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {

    public List<Unternehmen> sortListByAnzahl_Mitarbeiter(List<Unternehmen> liste) {
        return liste.stream()
                .sorted((Company, otherCompany) -> Company.getAnz().compareTo(otherCompany.getAnz()))
                .collect(Collectors.toList());
    }



    public void writeStatisticTopOrte(List<Unternehmen> liste,EK) {
        Repo repository = new Repo();

        List<Repo> client = liste.stream().sorted((client, otherclient) -> client.mehrEinkommen(otherKunde)).collect(Collectors.toList());
        try {
            repository.writeToFile("statistik.txt", client, ",");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}