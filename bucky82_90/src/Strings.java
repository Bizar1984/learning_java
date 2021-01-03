public class Strings {
    public static void main(String[] args) {

        String a = "apples";
        String b = "bomba";
        String c = "BOMBA";
        System.out.println(a.length());

        if(a.equals("apples")) {
            System.out.println("Yes sir, it equals apples");
        }
        if(b.equalsIgnoreCase(c)) {
            // ignore casing
            System.out.println("Yes sir, b and c are the same");
        } else {
            System.out.println("No sir, they are not the same");
        }


    }
}
