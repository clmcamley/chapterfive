//Exercise 5.6

public class ConvertMiles2KilometersAndBack {
    public static void main(String[] args) {
        System.out.printf("%-8s%-12s | %-12s%-8s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        int j = 20;
        for (int k = 1; k <= 10; k++) {
            System.out.printf("%-2d%6s%5.3f%7s | %2d%6s%5.3f\n", k, " ", (float)(k * 1.609), " ", j, " ", (float)(j / 1.609));
            j = j + 5;
        }
    }
}
