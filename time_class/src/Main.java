public class Main {
    public static void main(String[] args) {
        Time current = new Time(2, 56,34);
        current.nextSecond();
        current.nextSecond();
        current.setHour(4);
        current.previousSecond();
        System.out.println(current);
    }
}
