// 파일 명과 클래스 명이 같아야 됨
public class HelloJava { // 클래스 범위

    // 메서드 (String[] -> 배열)
    // 자바 프로그램은 main 메서드부터 시작
    // -> main 메서드는 필수이다.
    public static void main(String[] args) { // 메서드 범위
        System.out.println("Hello Java.");
    } // 메서드 범위 끝

} // 클래스 범위 끝

// 블록(범위) 덕분에 들여쓰기를 하지 않아도 되지만,
// 그렇지 않으면 사람이 읽기 힘들다.