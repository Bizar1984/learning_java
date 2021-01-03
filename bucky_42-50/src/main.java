import java.util.EnumSet;

class main {
    public static void main(String[] args) {
        potpie potObject = new potpie(19, 02, 1984);
        tuna tunaObject = new tuna("Bombadil", potObject);

        System.out.println(tunaObject);

        for(enumerate people: enumerate.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getGrade());

        System.out.println("\nAnd now for the range of constants!\n");


        for(enumerate people: EnumSet.range(enumerate.ellen, enumerate.nabiz))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getGrade());


    }

}
