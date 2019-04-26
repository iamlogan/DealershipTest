package dealershipteststep2;

public class DealershipTest {

    public static void main(String[] args) {
        
        Dealership dealership = new Dealership();
        
        String name;
        Comparable make;
        String registration;
        String model;
        String colour;
        
        System.out.println("B00289028 Car Dealership System");
        String optionString;
        Integer option;
        do {
            System.out.println("");
            System.out.println("0: quit");
            System.out.println("1: add make");
            System.out.println("2: find make");
            System.out.println("3: remove make");
            System.out.println("4: display all makes");
            System.out.println("5: add car");
            System.out.println("6: delete car");
            System.out.println("7: display cars of specific make");
            System.out.println("8: display all cars");
            
            optionString = Input.getString("option: ");
            try {
                option = Integer.valueOf(optionString);
            } catch (NumberFormatException e) {
                option = -1;
            }
            
            switch (option){
                
                // Quit.
                case 0:
                    System.out.println("quitting program");
                    break;
                
                // Add make.
                case 1:
                    name = Input.getString("make: ");
                    if (!"".equals(name)) {
                        dealership.addMake(name);
                    } else {
                        System.out.println("invalid input - empty field");
                    }
                    break;
                    
                // Find make.
                case 2:
                    name = Input.getString("make: ");
                    if (!"".equals(name)) {
                        dealership.findMake(name);
                    } else {
                        System.out.println("invalid input - empty field");
                    }
                    break;
                
                // Remove make.
                case 3:
                    name = Input.getString("make: ");
                    if (!"".equals(name)) {
                        dealership.removeMake(name);
                    } else {
                        System.out.println("invalid input - empty field");
                    }
                    break;
                
                // Display all makes.
                case 4:
                    dealership.display();
                    break;
                    
                // Add car.
                case 5:
                    name = Input.getString("make: ");
                    if (!"".equals(name)) {
                        
                        make = dealership.findMake(name);
                        if (make != null) {
                            
                            registration = Input.getString("registration: ");
                            model = Input.getString("model: ");
                            colour = Input.getString("colour: ");
                            
                            if ((!"".equals(registration)) && (!"".equals(model)) && (!"".equals(colour))) {
                                dealership.addCar(name, registration, model, colour);
                            } else {
                                System.out.println("invalid input - empty field");
                            }
                        }
                    } else {
                        System.out.println("invalid input - empty field");
                    }
                    
                    break;
                    
                // Remove car.
                case 6:
                    name = Input.getString("make: ");
                    if (!"".equals(name)) {
                        
                        make = dealership.findMake(name);
                        if (make != null) {
                            
                            registration = Input.getString("registration: ");
                            
                            if (!"".equals(registration)) {
                                dealership.removeCar(name, registration);
                            } else {
                                System.out.println("invalid input - empty field");
                            }
                        }
                    } else {
                        System.out.println("invalid input - empty field");
                    }
                    break;
                
                // Display cars of specific make.
                case 7:
                    name = Input.getString("make: ");
                    dealership.displayCars(name);
                    break;
                    
                // Display all cars.
                case 8:
                    dealership.displayAll();
                    break;
                
                // Invalid option.
                default:
                    System.out.println("invalid menu option");
                    break;
            }
        } while (option != 0);
    }
}
