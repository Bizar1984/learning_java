import java.util.Random;

class arrays {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int bombadillo[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        for(int counter=0; counter < bombadillo.length; counter++) {
            System.out.println(counter + "\t\t" + bombadillo[counter]);
        }

        int bomba[]={2, 4, 6, 8};
        int sum=0;

        for(int counter = 0; counter< bomba.length; counter++) {
            sum+=bomba[counter];
            System.out.println("Sum of numbers equals: " + sum);

        }

    }

}

