
import java.util.Scanner;
public class CtoFConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        boolean good =true;
        String trash = "";


        do {
            System.out.print("Please enter a temperature in Celsius. ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                good = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid temperature. You entered: " + trash);
                good = false;
            }
        }while(good == false);

        tempF = ((tempC * 9)/5) + 32;
        System.out.println("Your temperature in Celsius was: " + tempC + ". Your temperature in fahrenheit is " +
                ": "+ tempF +".");
        if(tempF <= 32){
            System.out.println( tempF +" degrees fahrenheit is freezing!");
        }
        else if(tempF >= 212){
            System.out.println( tempF + " degrees fahrenheit is boiling!");

        }
    }




}
