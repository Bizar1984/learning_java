public class sum {
    private int sum;
    private final int NUMBER;

    public sum(int x) {
        NUMBER = x;
    }
    public void add() {
        sum+=NUMBER;
    }
    public String toString() {
        return String.format("sum = %d\n", sum);
    }
}
