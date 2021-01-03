public class pike extends food {

    // pike class inherits from the food class, just like the other fish
    // implement/override the food method from the superclass
    // we can inherit, but we have to promise we use the abstract eat method in the food class
    public void eat() {
        System.out.println("This pike is delicious");
    }
}
