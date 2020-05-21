package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int n, i, room;
		String name, email;
			
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		
		Rent[] vect = new Rent[10];
		
		for (i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%nName: ", i);
			sc.nextLine(); //Sempre que usar nextInt e logo depois um nextLine, é preciso adicionar um extra.
			name = sc.nextLine();
			
			System.out.print("Email: ");
			email = sc.nextLine();
			
			System.out.print("Room: ");
			room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();

	}

}
