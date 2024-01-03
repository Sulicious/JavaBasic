package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // -> 2
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b; // -> 1
        System.out.println("a % b = " + mod);

        /*
            수학적으로 0으로 나누는 것을
            허용하지 않음

            -> divide by zero
        */
        // int z = 10 / 5;
    }
}
