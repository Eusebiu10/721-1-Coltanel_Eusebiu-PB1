//aici se vor face operatii cu fisiere
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repo {
    public List<Unternehmen> readFromFile(Integer id,String Unternehmensname,Unternehmensgröße un,Integer anz,Integer EK,String Ort ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(kundendaten.txt));
        String line = bufferedReader.readLine();
        String[] attributes;
        Unternehmen Comp;
        List<Unternehmen> listeCompany = new ArrayList<>();
        while (line != null) {
            attributes = line.split(',');
            Comp = new Comp(attributes[0], attributes[1], Diaet.valueOf(attributes[2]), attributes[3]);
            listeCompany.add(Comp);

            line = bufferedReader.readLine();
        }

        return listeCompany;
    }

    public void writeToFile(Integer id,String Unternehmensname,Unternehmensgröße un,Integer anz,Integer EK,String Ort ) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(kundensortiert.txt));
        for (Unternehmen Company : list) {
            String line = Unternehmen.getID() + ',' + Unternehmen.getUnternehmensname() + ',' +
                    Unternehmen.getUn() + ',' + Unternehmen.getanz() + ',' +Unternehmen.getEK() + ',' + Unternehmen.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
