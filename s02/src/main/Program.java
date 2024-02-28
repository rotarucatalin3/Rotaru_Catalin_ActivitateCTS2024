package main;

import java.io.FileNotFoundException;
import java.util.List;

import model.clase.Aplicant;
import model.readere.AngajatReader;
import model.readere.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader reader = new AngajatReader();
		try {
			listaAngajati = reader.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
