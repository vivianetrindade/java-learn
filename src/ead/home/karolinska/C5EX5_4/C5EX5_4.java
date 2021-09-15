package ead.home.karolinska.C5EX5_4;

public class C5EX5_4 {
    //method called checkFermat
    public static void checkFermat(int a, int b, int c, int n){
        if (n>2 && (Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)){
            System.out.print("Holy smokes, Fermat was wrong!");
        }else {
            System.out.print("No, that doesn't work.");
        }
    }
    public static void main(String[] args){
        // Chapter 5, exercise 5.4
        // Create method called checkFermat

        // Expected output: No, that doesn't work.
        // OR               Holy smokes, Fermat was wrong!
        int a = 2;
        int b = 4;
        int c = 5;
        int n = 2;
        checkFermat (a, b, c, n);
        // Only one of the test cases can work each time, so you can't
        // get both to succeed. In fact, one of the can't succed at all
        // unless you are only trying out part of the condition.




    }
}
