package dealershipteststep1;

public class DealershipTest {

    public static void main(String[] args) {
        
        Dealership dealership = new Dealership();
        String currentName;

        String optionString;
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: add make");
            System.out.println("2: find make");
            System.out.println("3: remove make");
            System.out.println("4: display");
            
            optionString = Input.getString("option: ");
            try {
                option = Integer.valueOf(optionString);
            } catch (NumberFormatException e) {
                option = -1;
            }
            
            switch (option){
                
                case 0:
                    System.out.println("quitting program");
                    break;
                    
                case 1:
                    currentName = Input.getString("make: ");
                    dealership.addMake(currentName);
                    break;
                    
                case 2:
                    currentName = Input.getString("make: ");
                    dealership.findMake(currentName);
                    break;
                
                case 3:
                    currentName = Input.getString("make: ");
                    dealership.removeMake(currentName);
                    break;
                    
                case 4:
                    dealership.displayMakes();
                    break;
                    
                default:
                    System.out.println("invalid menu option");
                    break;
            }
        } while (option != 0);
    }
}
