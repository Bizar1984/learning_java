public class arrays_in_methods {
    public static void main(String[] args) {
        int number_array[] = {5, 10, 15};
        change(number_array);

        for(int y: number_array)
            System.out.println(y);

    }

    public static void change(int x[]) {
        for(int counter=0;counter<x.length;counter++){
            x[counter] *= 10;
        }
    }
}
