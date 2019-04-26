package dealershipteststep1;

public class Dealership {
    
    private SortedLinkedList makes;
    
    public Dealership(){
        makes = new SortedLinkedList();
    }
    
    public void addMake(String name) {
        try {
            makes.insert(name);
            System.out.println("make inserted");
        } catch (SortedLinkedList.NotUniqueException e) {
            System.out.println("not added - make not unique");
        }
    }
    
    public void findMake(String name) {
        try {
            makes.find(name);
            System.out.println("make found");
        } catch (SortedLinkedList.NotFoundException e) {
            System.out.println("make not found");
        }
    }
    
    public void removeMake(String name) {
        try {
            makes.remove(name);
            System.out.println("make removed");
        } catch (SortedLinkedList.NotFoundException e) {
            System.out.println("remove invalid - make not found");
        }
    }
    
    public void displayMakes() {
        System.out.println(makes);
    }
    
}
