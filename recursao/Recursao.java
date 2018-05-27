public class Recursao {

    public static void main(String[] args) {
        System.out.println("====MDC: " + mdc(2, 2));
        System.out.println("====MDC: " + mdc(928, 100));
        System.out.println("====MDC: " + mdc(16, 8));
        System.out.println("====MDC: " + mdc(20, 25));

        System.out.println("====Converte: 10: " + converte("10"));
        System.out.println("====Converte: 101: " + converte("101"));
        System.out.println("====Converte: 11: " + converte("11"));
        System.out.println("====Converte: 11111111: " + converte("11111111"));
        System.out.println("====Converte: 10000000: " + converte("10000000"));
    }

    private static int mdc(int x, int y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            int resto = x % y;
            if (resto != 0)
                return mdc(y, resto);
            else
                return y;
        } else {
            int resto = y % x;
            if (resto != 0)
                return mdc(x, resto);
            else
                return x;

        }
    }


    private static int converte(String b) {
        if(b.length() == 0 || b.charAt(0) == '0') return 0;
        return (int) (Math.pow(2, b.length() - 1) + converte(b.substring(1)));

    }


}
