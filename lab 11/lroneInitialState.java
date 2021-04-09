import java.util.*;
import java.io.*;

public class lroneInitialState {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noprod = Integer.parseInt(br.readLine());
        String[] prods = new String[noprod];
        for (int i = 0; i < noprod; i++) {
            prods[i] = br.readLine();
        }
        for (int i = 0; i < noprod; i++) {
            String prod = prods[i];
            String prodPrevious = "";
            StringBuilder sb = new StringBuilder(prod);
            if (i == 0) {
                sb.prepend(".");
                sb.append("?");
                prods[i] = sb.toString();
                String temp = prods[i];
                char ch = temp.charAt(temp.length() - 1);
                for (int j = 1; j < noprod; j++) {
                    String temp1 = prods[i];
                    if (temp1.charAt(0) == ch) {
                        sb = new StringBuilder(prod);
                        sb.append("$");
                        sb.prepend(".");
                        prods[i] = sb.toString();
                    }

                }
            }

            else {
                sb = new StringBuilder(prod);
                char t = prod.charAt(0);
                if (t >= 'A' && t <= 'Z') {
                        
                }
            }

        }
    }
}
