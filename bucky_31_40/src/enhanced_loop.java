class enhanced_loop {
    public static void main(String[] args) {
        int bomba[] = {9, 16, 10};
        int total = 1500;

        for(int x: bomba) {
            total /= x;

        }
        System.out.println(total);
    }
}
