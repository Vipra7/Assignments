import java.util.Scanner;
public class Fourth
 {
   public static void main(String[] Strings)
    {
        double MinToYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        System.out.print("Input minutes: ");
        double min = input.nextDouble();
        long years = (long) (min / MinToYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approx " + years + " years and " + days + " days");
    }
}