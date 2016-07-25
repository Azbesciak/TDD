import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * Created by Witek on 25.07.2016.
 */
class CALC {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Class[] params = new Class[2];
    static {
        params[0] = params[1] = Integer.TYPE;
    }
    public static void main(String[] args) {
        String[] inputArguments;
        while ((inputArguments = getInput()) != null && inputArguments.length == 3) {
            int result = invokeChosenMethod(inputArguments);
            System.out.println(result);
        }
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        if ( b != 0) {
            return a / b;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }


    public static String[] getInput() {
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            return null;
        }
        return line.split(" ");
    }

    public static int modulo(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            return Integer.MAX_VALUE;
        }

    }

    public static String chooseMethod(String action) {
        switch (action) {
            case "+" : return "addition";
            case "-" : return "subtraction";
            case "/" : return "division";
            case "*" : return "multiplication";
            case "%" : return "modulo";
            default : return "unavailable";
        }

    }

    public static int invokeChosenMethod(String[] inputArguments) {
        try {
            Class cls = CALC.class;
            Object obj = cls.newInstance();
            String methodName = chooseMethod(inputArguments[0]);
            Method method = cls.getDeclaredMethod(methodName,params);
            int a = Integer.parseInt(inputArguments[1]);
            int b = Integer.parseInt(inputArguments[2]);
            int result = (Integer) method.invoke(obj, a, b );
            return result;

        } catch (Exception exc) {
            exc.printStackTrace();
            return 0;
        }
    }
}
