public class Main {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(((x*4) < (y + 15)) && x < y);
        System.out.println((20 < (y + 15)) && x < y);
        System.out.println((20 < 22 && x < y));
        System.out.println(true && x < y);
        System.out.println(true && true);
        System.out.println(true);

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println(((x == y) || (x < z)) && (x*2 + y)/5 > z);
        System.out.println(((false) || (x < z)) && (x*2 + y)/5 > z);
        System.out.println(((false) || (false)) && (x*2 + y)/5 > z);
        System.out.println((true) && (x*2 + y)/5 > z);
        System.out.println((true) && (20 + y)/5 > z);
        System.out.println((true) && (40)/5 > z);
        System.out.println((true) && 8 > z);
        System.out.println((true) && false);
        System.out.println(false);

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println((a || b) && ((a == b) || a));
        System.out.println((a || b) && ((false) || a));
        System.out.println(true && (false || a));
        System.out.println(true && true);
        System.out.println(true);

        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);
        System.out.println(true && 20 == (y % 6) * 5);
        System.out.println(true && 20 == 4 * 5);
        System.out.println(true && 20 == 20);
        System.out.println(true && true);
        System.out.println(true);

        //Question 5
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));
        System.out.println(2 == 2 || (Math.sqrt(81) <= 9 && (-4 <= 4)));
        System.out.println(2 == 2 || (Math.sqrt(81) <= 9 && true));
        System.out.println(2 == 2 || (true && true));
        System.out.println(2 == 2 || true);
        System.out.println(true || true);
        System.out.println(true);

    }
}
