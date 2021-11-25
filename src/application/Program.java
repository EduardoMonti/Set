package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Student code: ");
			int code = s.nextInt();
			a.add(code);
		}
		
		System.out.print("How many students for course B? ");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Student code: ");
			int code = s.nextInt();
			b.add(code);
		}
		
		System.out.print("How many students for course C? ");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Student code: ");
			int code = s.nextInt();
			c.add(code);
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("");
		System.out.println("Total students: " + total.size());

	}

}
