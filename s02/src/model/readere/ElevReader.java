package model.readere;

import model.clase.Aplicant;
import model.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            super.readAplicant(input2, e);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
