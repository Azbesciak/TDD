import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Witek on 11.07.2016.
 */
class Rownanie {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) {
        String str[] = null;
        while ((str = inputLine()) != null && str.length == 3) {
            System.out.println(equationsAmount( Double.parseDouble(str[0]),
                                                Double.parseDouble(str[1]),
                                                Double.parseDouble(str[2])
            ));

        }
    }

    public static int equationsAmount(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return 0;
        } else if (delta == 0) {
            return 1;
        } else {
            return 2;
        }
    }
    public static String[] inputLine(){
        String liczba;
        try {
            liczba = in.readLine();
        } catch (IOException e) {
            return null;
        }
        return liczba.split(" ");
    }
}
