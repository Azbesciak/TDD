import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Witek on 11.07.2016.
 */
class Suma {
    private static int sum = 0;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws IOException {
        String str;
        while ((str = in.readLine()) != null && str.length() != 0) {
System.out.println(add(Integer.parseInt(str))) ;
        }
        }

public static int add(int i) {
        sum += i;
        return sum;
        }

        }
