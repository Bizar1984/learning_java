class main_poly {
    public static void main(String[] args) {

        food bomba[] = new food[2];
        bomba[0] = new pike();
        bomba[1] = new salmon();


        for(int x = 0; x < bomba.length; x++) {
            bomba[x].eat();
        }

        fatty bombadil = new fatty();
        food sb = new seabass();

        bombadil.digest(sb);


    }
}
