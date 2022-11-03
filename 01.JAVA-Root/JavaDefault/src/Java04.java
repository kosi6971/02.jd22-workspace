import java.text.DecimalFormat;
import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        // [Java 조건 및 If 문]

        // 1. Java는 수학의 일반적인 논리 조건사용
        // (1) 미만: a < b
        // (2) 이하: a <= b
        // (3) 초과: a > b
        // (4) 이상: a >= b
        // (5) 같음: a == b
        // (6) 다름: a != b

        // Scanner를 사용하여 입력데이터 받기
        // java.utill.Scanner를 import하여 사용
        // 자동 import 단축키 : alt+shift+o
        // 스캐너 생성 시 값을 System.in을 설정하여 입력라인을 생성

        // 스캐너는 메모리 영역을 try
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("kosi : ");
            // 아래쪽에 입력라인이 생김
            // 입력 후 입력 데이터를 변수로 할당
            // nextLine()메서드로 입력 라인 전체를 가져온다
            // next메서드는 단어 하나를 가져온다
            // nextInt() -> 숫자를 입력받는 스캐너 메서드(형별로 다 있다)
            String actor = myObj.nextLine();
            System.out.println("kosi : " + actor);
            System.out.print("name : ");
            String name = myObj.nextLine();
            System.out.println("name : " + name);

            // 2. if문
            // : 조건이 true일때 실행할 코드를 제어함
            // if (조건문) {
            // // 실행코드
            // } else if (조건문) {
            // // 실행코드
            // } else {
            // // 실행코드
            // }
            // if : 지정된 조건이 true인 경우 실행할 코드
            // else if : 상단 조건이 false인 경우 새로운 조건 추가
            // lse : 모든 조건에 해당없을 경우 실행할 코드

            // if문 사용
            // 입력창에서 받은 데이터는 엔터기호 등 다른 데이터가 포함되어 있어서
            // == 비교 연산자로 하는 것이 아닌 변수.equals(내용) 메서드로 비교해야한다
            if (actor.equals("kosi") && name.equals("kosi"))
                System.out.println("K");
            else if (actor.equals("kr.sil") && name.equals("kr.sil"))
                System.out.println("R");
            else
                System.out.println("?");

            // 3. 삼항연산자(짧은 if문)
            // 변수 = (조건문) ? true시 실행문 : false시 실행문;
            System.out.print("birthday : ");
            String birth = myObj.nextLine();
            System.out.println(birth.equals("yes") ? "yeeee" : "no");

            // 4. switch 문 : 단일조건을 분류하여 실행코드를 나눔
            // switch(변수) {
            // case x:
            // // 실행코드
            // break;
            // case y:
            // // 실행코드
            // break;
            // default:
            // // 실행코드
            // }
            System.out.print("숫자 : ");
            int menu = myObj.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("tree");
                    break;
                default:
                    System.out.println("all");
                    break;
            }

            // 5. while문 : 조건이 true인 동안 반복실행 코드를 제어함
            // while (조건문) {
            // // 실행코드
            // }

            // 세자리마다 콤마 찍기 방법 :
            // DecimalFormat 클래스
            // 생성 : DecimalFormat 변수 = new DecimalFormat(형식)
            // 사용 : 변수.format(사용할 변수)
            DecimalFormat df = new DecimalFormat("###,###");
            // ###,### -> #은 숫자자리를 의미, 3자리 마다 ,형식

            System.out.print("반복 횟수 : ");
            int num = myObj.nextInt();
            int bnum = 0;
            while (bnum < num) {
                bnum++;
                System.out.println(bnum);
            }

            // 6. Do/While문
            // - 먼저 코드를 실행후 반복실행 여부를 제어함
            // do {
            // // 실행코드
            // }
            // while (조건문);
            System.out.print("월급 : ");
            int myPay = myObj.nextInt();
            System.out.print("횟수 : ");
            int payNum = myObj.nextInt();
            int payCycle = 1;
            do {
                System.out.println(
                        "월급 : " + df.format(myPay) + "원 *" + payCycle + "번\n" + df.format(myPay * payCycle) + "원");
                // 증감
                payCycle++;
            } while (payCycle <= payNum); // 세미콜론 필수

            // 7. for문 : 지정된 횟수 만큼 코드를 반복실행하여 제어함
            // for (시작값; 한계값; 증감) {
            // // 실행코드
            // }
            // (1) 시작값 : 변수선언과 시작값 할당
            // (2) 한계값 : 변수의 한계값 설정
            // (3) 증감 : 변수의 증가 / 감소
            // 무지개색을 배열 변수에 넣고 for문 돌리기
            String rainbow[] = { "빨강", "주황", "노랑", "초록", "파랑", "남", "보라" };
            for (int i = 0; i < rainbow.length; i++) {
                System.out.print(rainbow[i] + "색");
                if (i < rainbow.length - 1)
                    System.out.print(", ");
                else
                    System.out.println("입니다.");
            }

            // 8. for-each 문 : 배열값 만큼 자동으로 변수에 할당하면 실행코드 반복 제어함
            // for (타입선언변수 : 배열변수명) {
            // // 실행코드
            // }
            String player[] = { "김기춘", "홍서범", "하준상", "이종학", "예비:이병준", "예비:서이룡" };
            System.out.print("명단 : ");
            for (String mem : player) {
                System.out.print(mem + " ");
            }
            System.out.println("\n");
            
            // 9. for문 중단,계속 옵션 키워드
            // (1) continue 빼고 계속
            // (2) break 중단
            // "하준상" 제외, 예비 선수 제외
            System.out.print("2차 명단 : ");
            for (String mem : player) {
                if (mem == "하준상")
                    continue;
                if (mem == "예비:이병준")
                    break;
                System.out.print(mem+" ");
            }
            System.out.println("\n");
        }
        // catch(에러 발생 시, 처리 구역)
        catch (Exception e) {
            // e.getMessage -> 기본 에러 메시지
            // System.out.println(e.getMessage());
            // 결과 : null -> 내용이 없는 데이터

            // 사용자가 보여주는 메시지
            System.out.print("숫자 입력 할 것");
        }

    }
}
