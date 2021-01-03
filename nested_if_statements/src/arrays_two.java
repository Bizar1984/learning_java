import java.util.Random;

class arrays_two {
    public static void main(String[] args) {
        Random random = new Random();
        int freq[]= new int[7];
        // length of 7, because you want to start at 1 instead of 0

        for(int roll=1;roll<=100;roll++) {
            ++freq[random.nextInt(7)];
            // adding 1 for a 100 times to "random" index numbers 0 to 5
        }

        System.out.println("Face\tFrequency");
        for (int face=1; face<freq.length; face++) {
            System.out.println(face+"\t\t"+freq[face]);

        }

    }

}

