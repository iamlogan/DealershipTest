package dealershipteststep2;

public class Make implements Comparable<Make>{
    
    private String name;
    private SortedLinkedListCars cars;
    
    private Car car;
    
    public Make(String name){
        this.name = name;
        this.cars = new SortedLinkedListCars();
    }
    
    public String getName() {
        return this.name;
    }
    
    // Car is created.
    public void addCar(String registration, String model, String colour) {
        try {
            car = new Car(registration, model, colour);
            this.cars.insert(car);
            System.out.println("car added");
        } catch (SortedLinkedListCars.NotUniqueException e) {
            System.out.println("not added - registration not unique");
        }
    }
    
    // Car is created (but not saved).
    private Car tempCar(String registration) {
        car = new Car(registration, "", "");
        return car;
    }
    
    // Delete Car
    public void deleteCar(String registration) {
        try {
            car = tempCar(registration);
            this.cars.remove(car);
            System.out.println("car deleted");
        } catch (SortedLinkedListCars.NotFoundException e) {
            System.out.println("remove invalid - car not found");
        }
    }
    
    // Display all cars
    public void displayCars() {
        System.out.print(this.cars);
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public int compareTo(Make anotherMake) {
        return this.name.compareTo(anotherMake.getName());
    }
    
}
