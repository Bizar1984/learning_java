class main_method {
    public static void main(String[] args) {
        time time = new time();

        time.setTime(15, 42, 14);
        System.out.println(time.toMilitary());
        System.out.println(time.toString());

        tuna tunaObject = new tuna();
        tuna tunaObject2 = new tuna(5);
        tuna tunaObject3 = new tuna(5, 13);
        tuna tunaObject4 = new tuna(5, 13, 26);

        System.out.printf("%s\n", tunaObject.toMilitary());
        System.out.printf("%s\n", tunaObject2.toMilitary());
        System.out.printf("%s\n", tunaObject3.toMilitary());
        System.out.printf("%s\n", tunaObject4.toMilitary());


    }

}
