
import java.util.Scanner;
public class RectangleInfo {
//By Aidan Oates

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";

        System.out.print("Please enter the length of the rectangle   ");
        if (in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please restart and enter a valid input, you entered: " + trash);
            System.exit(0);
        }

        System.out.print("Now enter the width of the rectangle      ");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please restart and enter a valid input, you entered: " + trash);
            System.exit(0);
        }



        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonal = (length * length) + (width * width);
        System.out.println("With the width of your rectangle being " + width + ", and length being " + length + ", your" +
                " area would be " + area + ". Your perimeter would be, " + perimeter +", and diagonal would be " + diagonal);
    }
}
