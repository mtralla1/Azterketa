package azterketa;

import java.util.ArrayList;
import java.util.Scanner;

public class azterketa {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	    ArrayList<Double> zenbakik = new ArrayList<Double>();
	    
	    System.out.println("Sartu baraz besteko egin nahi dituzun zenbakiak (0 amaitzeko):");
	    
	    double zenb = sc.nextDouble();
	    while (zenb != 0) {
	      zenbakik.add(zenb);
	      zenb = sc.nextDouble();
	    }
	    
	    sc.close();
	    double gehiketa = 0;
	    for (double n : zenbakik) {
	    	gehiketa += n;
	    }
	    
	    double batazBeste = gehiketa / zenbakik.size();
	    System.out.println("Bataz bestekoa da: " + batazBeste);
	 }
}
	
	
	

