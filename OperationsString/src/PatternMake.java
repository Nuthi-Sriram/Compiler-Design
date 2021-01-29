package labeval1;

import java.util.*;
import java.io.*;

public class PatternMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "a";
		System.out.print("Enter z to terminate.\n");
		char ch = sc.next().charAt(0);
		while (ch != 'z') {
			System.out.print("Which one? 'b' or 'c'? ");
			ch = sc.next().charAt(0);
			if (ch == 'b' || ch == 'c') {
				str += ch;
			}
			System.out.println("The current string is: " + str);
		}
		System.out.println("The final string is: " + str);
	}

}

