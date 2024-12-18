public class BitCount {
    public static int countOnes(int n) {
        return Integer.bitCount(n);

    }

    public static void main(String[] args) {
        int n = 10; // пример
        System.out.println("Количество единиц в двоичном представлении: " + countOnes(n));
    }
}
