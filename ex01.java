package Array;
import java.util.Scanner;

public class ex01 {
	public static void main (String args[]) {
		
		Scanner read = new Scanner (System.in);
		int [] a = new int[6];
		int soma = 0;
		
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = -5;
		a[5] = 7;
		
		soma = a[0] + a[1] + a[5];
		System.out.println("A soma entre as posições 0, 1 e 5 é: " + soma + ".");
		
		a[3] = 100;
		
		for (int i = 0; i < 6; i++) {
			System.out.println(" Valor do vetor na Posição [" + (i+1) + "]: " + a[i]);			
			
		}
	}
}
