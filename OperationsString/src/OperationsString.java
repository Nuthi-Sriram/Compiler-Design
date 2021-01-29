import java.util.Scanner;

class operations {

	void prefix(String str) {
		int len = str.length();
		System.out.println("NULL");
		for (int i = 0; i < len; i++) {
			System.out.println(str.substring(0, i + 1));
		}
	}
	void properprefix(String str) {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.substring(0, i+1).length() == str.length()) {
				continue;
			}
			System.out.println(str.substring(0, i + 1));
		}

	}

	void substrings(String str) {
		int len = str.length();
		int temp = 0;
		// Total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String[len * (len + 1) / 2];

		// This loop maintains the starting character
		for (int i = 0; i < len; i++) {
			// This loop adds the next character every iteration for the subset to form and
			// add it to the array
			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		
		// This loop prints all the subsets formed from the string.
		System.out.println("All subsets for given string are: ");
		System.out.println("NULL");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	void propersubstrings(String str) {
		int len = str.length();
		int temp = 0;
		// Total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String[(len * (len + 1) / 2)-1];

		// This loop maintains the starting character
		for (int i = 0; i < len; i++) {
			// This loop adds the next character every iteration for the subset to form and
			// add it to the array
			for (int j = i; j < len; j++) {
				if (str.substring(i, j+1).length() == str.length()) {
					continue;
				}
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		
		// This loop prints all the subsets formed from the string.
		System.out.println("All proper subsets for given string are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	void suffix(String str) {
		int len = str.length();
		System.out.println("NULL");
		for (int i = len; i >= 0; i--) {
			System.out.println(str.substring(i, len));
		}
	}
	
	void propersuffix(String str) {
		int len = str.length();
		for (int i = len; i >= 0; i--) {
			if (str.substring(i, len).length() == str.length()) {
				continue;
			}
			System.out.println(str.substring(i, len));
		}
	}

}

public class OperationsString {
	public static void main(String args[]) {
		operations s = new operations();
		int option;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter one of the values to perform a string operation");
			System.out.println("1)Find prefixes of a string");
			System.out.println("2)All possible SubStrings of a string");
			System.out.println("3)All possible proper SubStrings of a string ");
			System.out.println("4)Find proper prefixes of a string");
			System.out.println("5)Find suffixes of a string");
			System.out.println("6)Find proper suffixes of a string");

			System.out.println("Press anyother key in order to terminate the program");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the String");
				String str = sc.next();
				s.prefix(str);
			}
				break;

			case 2: {
				System.out.println("Enter the String");
				String str = sc.next();
				s.substrings(str);
			}
				break;

			case 3: {
				System.out.println("Enter the String");
				String str = sc.next();
				s.propersubstrings(str);
			}
				break;
			case 4: {
				System.out.println("Enter the String");
				String str = sc.next();
				s.properprefix(str);
			}
				break;
			case 5: {
				System.out.println("Enter the String");
				String str = sc.next();
				s.suffix(str);
			}
				break;

			case 6: {
				System.out.println("Enter the String");
				String str = sc.next();
				s.propersuffix(str);
			}
				break;

			}
		}

		while (option >= 1 && option <= 6);
		sc.close();
	}
}
