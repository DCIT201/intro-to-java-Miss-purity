import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introduction
        System.out.println("You are welcome to Temperature Converter");
        System.out.println("Choose an option");
        System.out.println("1.Convert Celsius to Fahrenheit");
        System.out.println("2.Convert Fahrenheit to Celsius");

        // loop until a valid choice is entered
        int choice;
        while (true){
            System.out.println("Enter your choice(1 or 2)");
            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2 ){
                    break;
                }
                else {
                    System.out.println("Invalid input. Please enter 1 or 2");
                }
            }
            //loop until a valid temperature is entered
            double temperature;
            while(true){
                System.out.println("Enter the temperature to convert");
                if (scanner.hasNextDouble()){
                    temperature = scanner.nextDouble();
                    break;
                }
                else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            //perform the conversion
            if (choice == 1) {
                // Convert Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, fahrenheit);


            else if (choice == 2){
                //conversion from Fahrenheit to Celsius
                double Celsius = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, Celsius);
            }

            }
        }
        // Thank user
        System.out.println("Thank you for using the Temperature Converter");
        scanner.close();

    }
}
