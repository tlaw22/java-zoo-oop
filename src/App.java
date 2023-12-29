
public class App {
    public static void main(String[] args) throws Exception {
     Animal animal1 = new Animal(12, "M", 23);
    animal1.eat();
    animal1.sleep();
    Bird bird1 = new Bird(3,"M", 5);
    bird1.fly();
    Fish fish1 = new Fish(2, "F", 1);
    fish1.swim();
    Chicken chick1 = new Chicken(6, "F", 3);
    chick1.fly();
    // end main method
    }

}
