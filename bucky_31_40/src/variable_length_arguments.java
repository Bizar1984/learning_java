class variable_length_arguments {
    public static void main(String[] args) {

        System.out.println(average(34, 56, 9, 203, 52, 18, 2));

    }

    public static int average(int...numbers) {
        int total = 0;
        for(int x: numbers)
            total += x;

        return total/numbers.length;

    }
}
