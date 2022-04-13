import java.util.Scanner;
public class metric {
// By Aidan Oates

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        System.out.print("Enter a measurement in meters ");

        if (in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Please restart and enter a valid measurement. You entered: " + trash);
            System.exit(0);
        }
        inches = meters * 39.37007874;
        feet = meters * 3.2808;
        miles = meters * 0.00062137119224;

        System.out.println( meters +" in meters is equal to "+miles+"miles, "+feet+" in feet, and "+inches+" in inches.");
    }

}