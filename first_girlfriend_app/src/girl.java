public class girl {
    private String girlName;

    public girl (String name) {
        girlName = name;
    }

    public void setName(String name) {
        girlName = name;
    }
    public String getName(){
        return girlName;
    }

    public void saying() {
        System.out.println("Your first girlfriend was " + getName());
    }

    public void the_ending() {
        System.out.println("It's officially over now: " + getName());

    }
}
