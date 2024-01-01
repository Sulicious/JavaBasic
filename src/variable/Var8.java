package variable;

public class Var8 {
    public static void main(String[] args) {
        /*
            작은 메모리 공간 = 작은 숫자 표현 가능
            큰 메모리 공간 = 큰 숫자 표현 가능
        */

        // 기본 정수 리터럴 : int
        // 기본 실수 리터럴 : double

        // 정수
        byte b = 127; // -128 ~ 128
        short s = 32767; // -32868 ~ 32767
        int i = 2147483647; // -2147483648 ~ 2147483647

        // long 타입은 뒤에 L을 붙여야 됨
        // -9223372036854775808 ~ 9223372036854775807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // float은 뒤에 f 붙이기
        double d = 10.0; // double > float
    }
}
