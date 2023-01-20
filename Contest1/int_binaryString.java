import java.util.Scanner;

public class int_binaryString {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("Enter a number to convert it to a binary: ");
        // Scanner scanner = new Scanner(System.in);
        // int getIntNum = scanner.nextInt();

        // String getConvertedResult = convertIntToBinary(getIntNum);
        // System.out.println("Converted Binary: " + getConvertedResult);
        // String str ="Mango";
        // str.length();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int ans = (int) Math.sqrt((w - x) * (w - x) + (h - y) * (h - y));
            if (ans < k) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }

    static String convertIntToBinary(int numInt) {
        if (numInt == 0)
            return "0";

        StringBuilder stringBuilder = new StringBuilder();

        while (numInt > 0) {
            int remainder = numInt % 2;
            stringBuilder.append(remainder);
            numInt /= 2;
        }

        stringBuilder = stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
