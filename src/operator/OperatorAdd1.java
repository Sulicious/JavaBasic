package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); // -> 1

        // 증감 연산자
        ++a; // a = a + 1

        // 전위 증감 연산자 : ++a;
        // -> 코드 실행 전 연산 ( -1 )

        // 후위 증감 연산자 : a++;
        // -> 코드 실행 후 연산 ( +1 )
    }
}
