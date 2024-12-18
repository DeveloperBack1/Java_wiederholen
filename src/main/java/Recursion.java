public class Recursion {
    public static void main(String[] args) {
        counter(50);
    }

    public static void counter(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        counter(n-2);
    }

}
