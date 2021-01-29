
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

public class OperationsOnLanguages {
	public static void main(String args[]) {
		int option;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter one of the values to perform a language operation");
			System.out.println("1)To perform union");
			System.out.println("2)To perform intersection");
			System.out.println("3)To perform concatenation");

			System.out.println("Press anyother key in order to terminate the program");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter set1 length");
				int n = sc.nextInt();
				Set<Integer> set1 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					int num = sc.nextInt();
					set1.add(num);
				}
				System.out.println("Enter set2 length");
				n = sc.nextInt();
				Set<Integer> set2 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					int num = sc.nextInt();
					set2.add(num);
				}
				set2.addAll(set1);
				System.out.println("Union is: " + set2);
			}
				break;

			case 2: {
				System.out.println("Enter set1 length");
				int n = sc.nextInt();
				Set<Integer> set1 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					int num = sc.nextInt();
					set1.add(num);
				}
				System.out.println("Enter set2 length");
				n = sc.nextInt();
				Set<Integer> set2 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					int num = sc.nextInt();
					set2.add(num);
				}
				set2.retainAll(set1);
				System.out.println("Intersection is: " + set2);
			}
				break;

			case 3: {
				System.out.println("Enter set1 length");
				int n = sc.nextInt();
				Set<Integer> set1 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					int num = sc.nextInt();
					set1.add(num);
				}
				System.out.println("Enter set2 length");
				n = sc.nextInt();
				Set<Integer> set2 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					int num = sc.nextInt();
					set2.add(num);
				}
				System.out.println(new HashSet<Integer>() {
					{
						addAll(set1);
						addAll(set2);
					}
				});
			}
				break;
			}
		}

		while (option >= 1 && option <= 3);
		sc.close();
	}
}
