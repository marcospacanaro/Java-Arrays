package Array;
import java.util.Scanner;

public class ex03 {
	public static void main (String args[]) {
		
		Scanner read = new Scanner (System.in);
		
		int [][] matriz = new int[3][3];
		int contador = 0, i=0, j=0;
				
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				
				System.out.println("Informe o valor da matriz na posição [" + (i+1) + "] [" + (j+1) + "]: "); 
				matriz [i][j] = read.nextInt();
				
				if (matriz[i][j] > 10) {
					contador++;
				}
			}
		}
		
		System.out.println("A quantidade de valores maiores que 10 é: ");
	}
}