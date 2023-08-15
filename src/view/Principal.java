package view;
import controller.FatDuplo;
public class Principal {

	public static void main(String[] args) {
		FatDuplo ftd = new FatDuplo();
		
		int n = 5;
		
		if (n % 2 == 0) {
			System.out.println("Numero informado deve ser impar");
		} else {
			int FatDuplo = ftd.fat(n);
			System.out.println(FatDuplo);
		}
		
		
		
				
		

	}

}
