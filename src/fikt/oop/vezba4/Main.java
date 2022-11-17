package fikt.oop.vezba4;

public class Main {
			public static void main(String[] args) {
	        Avtomobil avtomobil = new Avtomobil("Audi", "A5", 195000, "Crna");

	        System.out.println("Marka: " + avtomobil.getMarka());
	        System.out.println("Model: " + avtomobil.getModel());
	        System.out.println("Kilometri pred mnozhenje: " + avtomobil.getPominatiKm());
	        System.out.println("Kilometri posle mnozhenje: " + avtomobil.mnozenjeKm(2));
	        System.out.println("Boja: " + avtomobil.getBoja());
	    }
}
