package dealershipteststep2;

public class Car implements Comparable<Car>{
    
    private String registration;
    private String model;
    private String colour;
    
    public Car(String registration, String model, String colour){
        this.registration = registration;
        this.model = model;
        this.colour = colour;
    }
    
    public String getRegistration() {
        return this.registration;
    }
    
    @Override
    public String toString() {
        String details = String.format("    " + this.registration + ", " + this.model + ", " + this.colour);
        return details;
    }
    
    @Override
    public int compareTo(Car anotherCar) {
        return this.registration.compareTo(anotherCar.getRegistration());
    }
    
}
