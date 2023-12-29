public class Chicken extends Bird{

    public Chicken(int age, String gender, int weight) {
        super(age, gender, weight);
        
    }
    // Creating a method of the same name, inside of the Chicken class is overriding the method from the super class.

    public void fly(){
        System.out.println("Chickends are unable to fly.");
    }
    
    
}
