public class Animal {
    int age;
    String gender;
    int weight;
    public Animal(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Eating ...");
    }
    public void sleep(){
        System.out.println("Sleeping ...");
    }
}
