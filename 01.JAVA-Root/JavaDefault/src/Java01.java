public class Java01 {
    public static void main(String[] args) {
        // 자바 class는 소스 단위 블록
        // 자바 main메서드는 class의 첫 실행 메서드

        // 자바 출력1 : println() - 뒤에 enter가 들어가 있는 메서드 | 단축키 : syso
        System.out.println("println");
        // 자바 출력2 : print - 뒤에 enter가 들어가 있지 않은 메서드
        System.out.print("print\n");

        // 홑따옴표 : ''는 한 글자만 출력할 때 사용된다
        System.out.println('홑');
        System.out.println("홑따옴표");

        // 숫자 출력
        System.out.println(3);
        System.out.println(365);
        System.out.println(10000);
        // 계산
        System.out.println(3+3);
        System.out.println(3-3);
        System.out.println(3*3);
        System.out.println(3/3);
        System.out.println(3%3);
    }
}