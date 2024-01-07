package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 1;

        b = ++a; // a값 먼저 증가 후 b에 대입
        // a = a + 1
        // b = a
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자
        a = 1; // 1 -> 1
        b = 0; // 1 -> 0

        b = a++; // a값을 b에 대입 한 후 a값을 증가
        // b = a
        // a = a + 1
        System.out.println("a = " + a + ", b = " + b);
    }
}
