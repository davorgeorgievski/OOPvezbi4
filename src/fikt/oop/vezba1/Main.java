package fikt.oop.vezba1;

public class Main {
	  public static void main(String[] args) {
	        Covek c = new Covek ();
	        c.setIme("Seka");
	        c.setPrezime("Aleksic");
	        c.setEmbg("5510773411003");

	        System.out.println("Ime: " + c.getIme());
	        System.out.println("Prezime: " + c.getPrezime());
	        System.out.println("EMBG: " + c.getEmbg());
	    }
}
