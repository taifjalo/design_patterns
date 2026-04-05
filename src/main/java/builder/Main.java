package builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // <-- Print Computer Builder Pattern Without Director --> 
        System.out.println("\n=== Computer Builder Pattern  Without Director ===\n");

        // Step 1: Build a Office Computer 
        // Without Director: Building an office computer using the GamingComputerBuilder and calling all the build methods to construct the computer.
        
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        gamingBuilder.buildProcessor();
        gamingBuilder.buildRAM(); 
        gamingBuilder.buildHardDrive();
        gamingBuilder.buildGraphicsCard();
        gamingBuilder.buildOperatingSystem();

        // Step 2: Get the final constructed Computer object.
        // Get the constructed gaming computer from the builder interface and print its details.

        Computer gamingComputer = gamingBuilder.getComputer();
        System.out.println(gamingComputer);


        // Step 1: Build a Office Computer 
        // Without Director: Building an office computer using the OfficeComputerBuilder and calling all the build methods to construct the computer.

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        officeBuilder.buildProcessor();
        officeBuilder.buildRAM();
        officeBuilder.buildHardDrive();
        officeBuilder.buildGraphicsCard();
        officeBuilder.buildOperatingSystem();

        // Step 2: Get the final constructed Computer object.
        // Get the constructed office computer from the builder interface and print its details.
        
        Computer officeComputer = officeBuilder.getComputer();
        System.out.println(officeComputer);






        // <-- Print Computer Builder Pattern Director --> 
        System.out.println("=== Computer Builder Pattern With Director ===\n" );

        // With Director: Using the ComputerDirector to construct a gaming computer by passing the GamingComputerBuilder to the director's constructComputer method.
        ComputerDirector director;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Build a computer:\n" +
                "1.Pre-configured Office PC\n" +
                "2.Pre-configured Gaming PC"
        );
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
            // Step 1: Build a Office Computer 
                ComputerBuilder officePCBuilder = new OfficeComputerBuilder();

            // Step 2: Create Director and Construct Computer Method from Director Class.
                director = new ComputerDirector(officePCBuilder);
                director.constructComputer();

            // Step 3: Get the final constructed Computer object.
                Computer officePC = officePCBuilder.getComputer();

                System.out.println("Office PC:\n" + officePC);

                break;
            case 2:
                ComputerBuilder gamingPCBuilder = new GamingComputerBuilder();

                director = new ComputerDirector(gamingPCBuilder);
                director.constructComputer();
                
                Computer gamingPC = gamingPCBuilder.getComputer();
                System.out.println("Gaming PC:\n" + gamingPC);

                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}
