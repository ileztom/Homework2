public class Homework2 {
    public static void main(String[] args){
        System.out.println(ex1(10,6));
        ex2(5);
        System.out.println(ex3(2));
        ex4(5);
        System.out.println(ex5(2021));
    }

    static boolean ex1(int a, int b) {
        if(a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    static void ex2(int a) {
        System.out.println(a < 0? "отрицательное число" : "положителльное число");
    }

    static boolean ex3(int a) {
        if(a < 0) {
            return true;
        }
        return false;
    }

    static void ex4(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("_");
        }
    }

    static boolean ex5(int a){
        if (a % 4 == 0 && a % 4 != 100 && a % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
