package Basic_Math;

class GCD {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;

        int a = n1, b = n2;
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        System.out.print("GCD = " + a);
    }
}
