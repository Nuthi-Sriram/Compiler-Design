package labeval1;
import java.util.*;
import java.io.*;

public class LanguageMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String W ");
		String W=sc.nextLine();
		System.out.println("Enter String L1 ");
		String L1=sc.nextLine();
		System.out.println("Enter String L2 ");
		String L2=sc.nextLine();
		StringBuilder br=new StringBuilder();
		br.append(L1);
		String L1R=br.reverse().toString();
		System.out.println("The Strings W, L1, L2, L1R,W.L2 are as follows:");
		System.out.println(W);
		System.out.println(L1);
		System.out.println(L2);
		System.out.println(L1R);
		String WL2=W.concat(L2);
		System.out.println(WL2);
		System.out.println("The final string is: ");
		HashSet<Character> finalans=new HashSet<>();
		for(char ch : L1R.toCharArray()) {
			finalans.add(ch);
		}
		for(char ch : WL2.toCharArray()) {
			finalans.add(ch);
		}
		System.out.print(finalans);
	}

}
