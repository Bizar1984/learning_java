class main_class {
    public static void main(String[] args) {
        double amount;
        double principal = 1000;
        double rate = .03;
        int small = 3;
        int big = 30;

        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1 + rate, year);
            System.out.println(2020 + year + " " + amount);
        }

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.min(small, big));
    }
}
