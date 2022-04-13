import java.util.Scanner;
public class FuelCosts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numGallonsInTank = 0;
        double fuelEfficiencyMPG = 0;
        double gasPricePerGallon = 0;
        double numMiles = 100;
        double costPer100 = 0;
        double howFar = 0;
        String trash = "";
//end of variables

        System.out.print("Please enter the amount of gallons in the tank.     ");
            if (in.hasNextDouble()) {
                numGallonsInTank = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid input. You entered: " + trash);
                System.exit(0);
            }

        System.out.print("Please enter your fuel efficiency. (MPG)     ");

            if (in.hasNextDouble()) {
                fuelEfficiencyMPG = in.nextDouble();
                in.nextLine();

            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid input. You entered: " + trash);
                System.exit(0);
            }



        System.out.print("Enter the price of gas per gallon:    ");

            if (in.hasNextDouble()) {
                gasPricePerGallon = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid input. You entered: " + trash);
                System.exit(0);
            }


         costPer100 = (numMiles/fuelEfficiencyMPG) * gasPricePerGallon;
         howFar = numGallonsInTank * fuelEfficiencyMPG;
        System.out.println("The cost per 100 miles would be: $" + costPer100 +", the amount of miles you can go on your current" +
                "tank is: " + howFar);
    }
}