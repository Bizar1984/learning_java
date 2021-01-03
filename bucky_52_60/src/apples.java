public class apples {
    public static void main(String[] args) {

        AnimalList ALO = new AnimalList();
        Dog labrador = new Dog();
        Fish pike = new Fish();
        ALO.add(labrador);
        ALO.add(pike);

        Animal[] animal_list = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();

        animal_list[0] = d;
        animal_list[1] = f;

        for(Animal x: animal_list) {
            x.noise();
        }




    }

}
