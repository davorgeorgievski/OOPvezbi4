package fikt.oop.vezba2;

public class Main {
	public static void main(String[] args) {
        Restoran rest = new Restoran();
        rest.setIme("Aurum");
        rest.setLokacija("Bitola");
        rest.setTelefon("047-555-333");
        rest.setBrSedishta(80);

        System.out.println("Kontakt telefonot na restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " e: " + rest.getTelefon());
        System.out.println("Restoranot ima kapacitet od: " + rest.getBrSedishta() + " sedista.");

	}
}
