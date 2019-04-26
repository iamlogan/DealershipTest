package dealershipteststep2;

public class Dealership {
    
    private SortedLinkedListMakes makes;
    
    private Make make;
    
    // Constructor
    public Dealership(){
        this.makes = new SortedLinkedListMakes();
    }
    
    // Make is created and saved to the dealership inventory.
    public void addMake(String name) {
        try {
            make = new Make(name);
            makes.insert(make);
            System.out.println("make added");
        } catch (SortedLinkedListMakes.NotUniqueException e) {
            System.out.println("not added - make not unique");
        }
    }
    
    // Make is created (but not saved).
    private Make tempMake(String name) {
        make = new Make(name);
        return make;
    }
    
    // Find Make from String.
    public Comparable findMake(String name) {
        Comparable foundMake = null;
        try {
            make = tempMake(name);
            foundMake = this.makes.find(make);
            System.out.println("make found");
        } catch (SortedLinkedListMakes.NotFoundException e) {
            System.out.println("make not found");
        }
        return foundMake;
    }
    
    // Remove Make after being identified from String.
    public void removeMake(String name) {
        try {
            make = tempMake(name);
            this.makes.remove(make);
            System.out.println("make removed");
        } catch (SortedLinkedListMakes.NotFoundException e) {
            System.out.println("remove invalid - make not found");
        }
    }
    
    // Display all makes
    public void display() {
        System.out.print(this.makes);
    }
    
    // Add car
    public void addCar(String name, String registration, String model, String colour) {
        try {
            make = tempMake(name);
            Make foundMake = this.makes.find(make);
            foundMake.addCar(registration, model, colour);
        } catch (SortedLinkedListMakes.NotFoundException e) {
            System.out.println("car not added - make not found");
        }
    }
    
    // Remove car
    public void removeCar(String name, String registration) {
        try {
            make = tempMake(name);
            Make foundMake = this.makes.find(make);
            foundMake.deleteCar(registration);
        } catch (SortedLinkedListMakes.NotFoundException e) {
            System.out.println("car not deleted - make not found");
        }
    }
    
    // Display cars of a specific make.
    public void displayCars(String name) {
        try {
            make = tempMake(name);
            Make foundMake = this.makes.find(make);
            foundMake.displayCars();
        } catch (SortedLinkedListMakes.NotFoundException e) {
            System.out.println("details not displayed - make not found");
        }
    }
    
    // Display all makes and cars.
    public void displayAll() {
        makes.printEverything();
    }
    
}
