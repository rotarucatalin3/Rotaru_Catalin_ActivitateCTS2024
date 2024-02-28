package model.readere;

import model.clase.Angajat;
import model.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();
            super.readAplicant(input2, a);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            a.setSalariu(salariu);
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}
