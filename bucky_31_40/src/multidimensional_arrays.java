class multidimensional_arrays {
    public static void main(String[] args) {
        int firstarray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int secondarray[][] = {{20, 21, 22}, {24, 25, 26}};

        System.out.println("This is the first array");
        display(firstarray);

        System.out.println("This is the second array");
        display(secondarray);

    }

    public static void display(int x[][]) {
        for(int row=0;row<x.length; row++) {
            for(int column=0;column<x[row].length; column++) {
                System.out.print(x[row][column] + "\t");

            }
            System.out.println();
        }
    }
}
