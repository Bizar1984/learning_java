class main_46 {
    public static void main(String[] args) {
        tuna_two member1 = new tuna_two("Megan", "Fox");
        tuna_two member2 = new tuna_two("Natalie", "Portman");
        tuna_two member3 = new tuna_two("Taylor", "Swift");

        // all objects share static variables, in this case member number
        System.out.println();
        System.out.println(tuna_two.getMembers());
        System.out.println();
        // even without an object you can access the members
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member1.getMembers());

        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());

        // summing stuff
        System.out.println();

        sum sumObject = new sum(10);
        // pass the parameter 10 for the constructor
        for(int i = 0; i <5; i++) {
            sumObject.add();
            System.out.printf("%s", sumObject);
        }

        // inheritance
        pike pikeObject = new pike();
        salmon salmonObject = new salmon();
        System.out.println();
        pikeObject.eat();
        salmonObject.eat();
    }
}
