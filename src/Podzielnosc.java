import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Witek on 30.07.2016.
 */
class Podzielnosc {

    private static int lineAmount = 0;
    private static int[] input = {};

    public static void main(String[] args) {
        readInput(System.in);
        setLineAmout(input);
        input = Arrays.copyOfRange(input,1,input.length);

        while (lineAmount-- > 0) {
            if (input != null && input.length < 3) {
                readInput(System.in);
            }
            if (input == null) {
                return;
            }
            String answer = getAnswer(input[0], input[1], input[2]);
            System.out.println(answer);
        }
    }

    static void readInput(InputStream stream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        int[] result;
        try {
            String inputLine = reader.readLine();
            result = Arrays.stream(inputLine.split(" +")).map(String::trim)
                            .mapToInt(Integer::parseInt).toArray();
        } catch (Exception e) {
            result = null;
        }
//        Integer[] boxedInput = input;
//        input = Stream.concat(Arrays.stream(input), Arrays.stream(result)).toArray();
        input = result;
    }
    static String getAnswer(int max, int dividedBy, int notDividedBy) {
        String answer = "";
        if (notDividedBy != 0) {
            for (int number = dividedBy; number < max; number += dividedBy) {
                if (number % notDividedBy != 0) {
                    answer += number;
                    answer += " ";
                }
            }
        }
        if (input.length >= 3) {
        input = Arrays.copyOfRange(input,3,input.length);
        }
        if (answer.length() > 0) {
        answer = answer.substring(0,answer.length() - 1); //cut off last whitespace
        }
        return answer;
    }
    static void setLineAmout(int[] input) {
        if (input != null && input.length > 0) {
            lineAmount = input[0];
        }
    }

    static int getLineAmout() {
        return lineAmount;
    }
    static int[] getInput() {
        return input;
    }
}
