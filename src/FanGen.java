import java.util.Scanner;

/**
 * Created by Witek on 10.07.2016.
 */
class FanGen {
    private int size;
    private int halfSize;
    private static int n;
    private char wiatrak[][];
    private boolean isReversed = false;
    public FanGen(){

    }
    public static void main(String arg[]) {
        FanGen fan = new FanGen();
        Scanner in = new Scanner(System.in);
        while (true) {
            n = in.nextInt();
            if (n != 0) {
                fan.setSize(n);
                System.out.print(fan.result() + "\n\n");
            }else {
                return;
            }
        }
    }
    private static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public void setSize(int n) {
        if (n < 0) {
            n *= -1;
            isReversed = true;
        }
        size = 2*n;
        wiatrak = new char[n][2*n];
        halfSize = n;
    }

private void initializeFan() {
    for (int height = 0; height < halfSize; height++) {
        for (int width = 0; width < halfSize; width++) {
            if (height - width >= 0) {
                wiatrak[height][width] = '*';
            } else {
                wiatrak[height][width]= '.';
            }
        }
    }
}
    public String result() {
        String result = "";
        initializeFan();
        for (int height = 0; height < halfSize; height++) {
            String line = "";
            for (int width = 0; width < size; width++) {
                if (width >= halfSize) {
                    wiatrak[height][width] = wiatrak[ halfSize - 1 - height][ width - halfSize];
                }
                line += wiatrak[height][width];
            }
            if (isReversed) {
                line = reverseString(line);
            }
            line += "\n";
            result += line;
        }
        return result + new StringBuilder(result).reverse().toString().substring(1);
    }
}
