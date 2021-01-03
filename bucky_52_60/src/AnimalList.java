public class AnimalList {

    private Animal[] list_all_animals = new Animal[5];
    private int i = 0;

    public void add(Animal a) {
        if(i < list_all_animals.length) {
            list_all_animals[i] = a;
            System.out.println("Animal added at index " + i);
            i++;
        }
    }
}
