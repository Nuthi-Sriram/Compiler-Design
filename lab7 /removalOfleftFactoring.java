import java.util.*;
import java.lang.*;
import java.io.*;

public class removalOfleftFactoring {
    public static void main(String[] args) throws java.lang.Exception {
        // Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of test cases:");
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // int n=Integer.parseInt(br.readLine());
            String c = br.readLine();
            String[] sa =c.trim().split("-->");
            String lhs = sa[0];
            sa = c.trim().split("|");
            int n = sa.length;
            String[] rhs = new String[n];
            //System.out.println(lhs);
            //System.out.println("Test");
            for (int i = 0; i < n; i++) {
                rhs[i] = sa[i];
                System.out.print(rhs[i]+" ");
            }
            
        }
    }
}
