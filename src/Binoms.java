import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Witek on 11.07.2016.
 */
class Binoms {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String args[]) throws IOException {
        Binoms binoms = new Binoms();
        String table[] = inputLine();
        int t;
        if (table.length == 1) {
            t = Integer.parseInt(table[0]);
        } else {
            return;
        }
        while (t --> 0) {
            table = inputLine();
            if (table.length == 2) {
                double n = Double.parseDouble(table[0]);
                double k = Double.parseDouble(table[1]);
                System.out.print((long)binoms.getResult(n, k));
                if (t > 0) {
                    System.out.print("\n");
                }
            }
        }
    }
    public static String[] inputLine() throws IOException {
        String liczba;
        liczba = in.readLine();
        return liczba.split(" ");
    }

    public float getResult(double n, double k) {
        if (k == 0) {
            return 1;
        } else {
            float result = 1;
            if (k < n - k) {
                for (double i = n - k + 1 ; i <= n; i++) {
                    result *= i;
                }
                result /= silnia(k);
            } else {
                for (double i = k + 1 ; i <= n; i++) {
                    result *= i;
                }
                result /= silnia(n - k);
            }

            return result;
        }

    }
    public double silnia(double x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * silnia(x - 1);
        }
    }

}
