
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

public class operationsOnLanguages {
	public static void main(String args[]) {
		int option;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter one of the values to perform a language operation");
			System.out.println("1)To perform difference of two sets");
			System.out.println("2)To reverse every string present in a set");
			System.out.println("3)To perform kleene closure");
			System.out.println("4)To perform positive closure");

			System.out.println("Press any other key in order to terminate the program");
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
				// Difference between HashSet1 and HashSet2
				set1.removeAll(set2);
				System.out.println("Set1 without Set2 numbers: " + " " + set1);
			}
				break;

			case 2: {
				System.out.println("Enter the number of strings");
				int n = sc.nextInt();
				String[] arr=new String[n];
				for(int i=0;i<n;i++) {
					String str=sc.next();
					arr[i]=str;
				}
				
				for(int k=0;k<n;k++) {
					char[] temp=arr[k].toCharArray();
					for(int i=0,j=arr[k].length()-1;j>0 && i<n;i++,j--) {
 						char tem=temp[i];
 						temp[i]=temp[j];
 						temp[j]=tem;
					}
					System.out.println(temp);
					arr[k]=String.valueOf(temp);
				}
				
				
			}
				break;

			case 3: {
				System.out.println("Enter set1 number of elements");
				int n = sc.nextInt();
				Set<String> set1 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					String num = sc.next();
					set1.add(num);
				}
				System.out.println("Enter set2 number of elements");
				n = sc.nextInt();
				Set<String> set2 = new HashSet<>();
				for (int i = 0; i < n; i++) {
					String num = sc.next();
					set2.add(num);
				}
				Set<String> ans = new HashSet<>();
				ans.add("lambda");
				ans.addAll(set1);
				ans.addAll(set2);
				String prev1="",prev2="",prev3="",prev4="";
				for(int i=1;i<=2;i++) {
					prev1=set1+""+set1;
					ans.add(prev1);
					 prev2=set1+""+set2;
					ans.add(prev2);
					 prev3=set2+""+set1;
					ans.add(prev3);
					 prev4=set2+""+set2;
					ans.add(prev4);
				}
				for(int i=1;i<=2;i++) {
					 prev1=set1+""+prev1;
					ans.add(prev1);
					 prev2=set1+""+prev2;
					ans.add(prev2);
					 prev3=set2+""+prev1;
					ans.add(prev3);
					 prev4=set2+""+prev2;
					ans.add(prev4);
				}
				System.out.println(ans);
				
				
				
			}
				break;
			
			
		case 4: {
			System.out.println("Enter set1 number of elements");
			int n = sc.nextInt();
			Set<String> set1 = new HashSet<>();
			for (int i = 0; i < n; i++) {
				String num = sc.next();
				set1.add(num);
			}
			System.out.println("Enter set2 number of elements");
			n = sc.nextInt();
			Set<String> set2 = new HashSet<>();
			for (int i = 0; i < n; i++) {
				String num = sc.next();
				set2.add(num);
			}
			Set<String> ans = new HashSet<>();
			ans.addAll(set1);
			ans.addAll(set2);
			String prev1="",prev2="",prev3="",prev4="";
			for(int i=1;i<=2;i++) {
				 prev1=set1+""+set1;
				ans.add(prev1);
				 prev2=set1+""+set2;
				ans.add(prev2);
				 prev3=set2+""+set1;
				ans.add(prev3);
				 prev4=set2+""+set2;
				ans.add(prev4);
			}
			for(int i=1;i<=2;i++) {
				 prev1=set1+""+prev1;
				ans.add(prev1);
				 prev2=set1+""+prev2;
				ans.add(prev2);
				 prev3=set2+""+prev1;
				ans.add(prev3);
				 prev4=set2+""+prev2;
				ans.add(prev4);
			}
			System.out.println(ans);
			
			
			
		}
			break;
		}
		}

		while (option >= 1 && option <= 4);
		sc.close();
	}
}
