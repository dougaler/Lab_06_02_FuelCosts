import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double gallons;
        double fueleff;
        double pricepg;
        double costperhund;
        double howfar;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of gallons in tank");
        if(in.hasNextDouble()) {
            gallons = in.nextDouble();
            in.nextLine();
            System.out.println("Enter the fuel efficiency in miles/gallon");
            if(in.hasNextDouble()) {
                fueleff = in.nextDouble();
                in.nextLine();
                System.out.println("Enter the price of gas per gallon");
                if(in.hasNextDouble()) {
                    pricepg = in.nextDouble();
                    in.nextLine();
                    costperhund = (100/fueleff)*pricepg;
                    howfar = gallons*fueleff;
                    System.out.printf("The cost per 100 gallons is %.2f%n", costperhund);
                    System.out.printf("With the current gas in the tank, the car can go %.2f miles%n", howfar);
                }else{
                    trash = in.nextLine();
                    System.out.println("Invalid price of gas per gallon entered: "+trash);
                }
            }else{
                trash = in.nextLine();
                System.out.println("Invalid fuel efficiency entered: "+trash);
            }
        }else{
            trash = in.nextLine();
            System.out.println("Invalid gallon in tank entered: "+trash);
        }


    }
}