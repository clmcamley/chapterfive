//Exercise 5.4

public class ConvertMiles2Kilometers {
    public static void main(String[] args) {
        System.out.println("Miles     Kilometers");
        for (int k = 1; k <= 10; k++) {
            System.out.printf("%-2d%8s%5.3f\n", k, " ", (float)(k * 1.609));
        }
    }
}