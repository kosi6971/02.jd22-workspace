public class Java03 {
    public static void main(String[] args) {
        /*
         * [ 자바 연산자 ] : 변수와 값에 대한 연산을 수행하는데 사용됨
         * 
         * [1.산술 연산자] : 일반적인 수학 연산을 수행하는 데 사용
         * + 더하기 x + y
         * - 빼기 x - y
         * 곱하기 x * y
         * / 나누기 x / y
         * % 나머지 x % y
         * ++ 1씩증가 ++x
         * -- 1씩감소 --x
         */
        System.out.println("[ 산술 연산자 ]");
        System.out.println("3+7*9/20-5=" + (3 + 7 * 9 / 20 - 5));
        System.out.println("500/7...?=" + (500 % 7));
        int worldNum = 78;
        System.out.println("worldNum : " + (worldNum++));
        System.out.println("worldNum : " + (++worldNum));
        System.out.println("worldNum : " + (worldNum--));
        System.out.println("worldNum : " + (--worldNum));

        // [2. 할당연산자] : = 오른쪽의 값을 왼쪽에 할당함!

        // [3. 대입연산자] : 기존값에 연산을 중첩함 -> += , -=, *=, /=, %=
        System.out.println("[ 대입 연산자 ]");
        System.out.println(worldNum += 10);

        // [4. 비교연산자] : >,<,==,!=,>=,<=
        System.out.println("[ 비교 연산자 ]");
        int broAge = 19, myAge = 18;
        System.out.println("broAge up? : " + (broAge > myAge));
        System.out.println("broAge up? : " + (broAge > myAge ? "yes" : "no"));

        // [5. 논리연산자] : &&(논리곱), ||(논리합), !(논리부정)
        System.out.println("[ 논리 연산자 ]");
        String man = "남자";
        int age = 20;
        System.out.println(man == "남자" && age >= 20);
        System.out.println(man == "남자" || age < 20);
        System.out.println(!(man == "남자" || age < 20));

        // [자바 문자열 : String형]
        System.out.println("[자바 문자열 : String형]");
        // 1. 문자열은 텍스트를 저장하는 데 사용
        // 2. String변수에는 큰따옴표로 묶인 문자열임!
        String myFace = "I Am Very Handsome!";
        // 3. 문자열 길이
        // length()메소드 -공백도 포함
        System.out.println(myFace);
        System.out.println(myFace.length());
        // 4.문자열 메서드
        // toUpperCase() - 모두 대문자 변환
        System.out.println(myFace.toUpperCase());
        // toLowerCase() - 모두 소문자 변환
        System.out.println(myFace.toLowerCase());
        // 5. 문자열 시작순번 :
        // indexOf()메서드
        // - 문자열(공백 포함)에서 지정된 텍스트가 처음 나타나는 인덱스순번 숫자리턴
        // - 대소문자를 구분, 찾는 문자열이 없으면 -1 return, 0부터 시작
        System.out.println(myFace.indexOf("Handsome"));
        System.out.println(myFace.indexOf("handsome")); // 값을 찾을 수 없기에 -1 출력
        // 6. 문자욜 일부 가져오기
        // substring(시작 순번, 끝순번 다음순번)
        System.out.println(myFace.substring(10, 18));
        // 7. 문자열 일부 변경
        // replace(바꿀문자열, 바뀔문자열)
        System.out.println(myFace.replace("Handsome", "Smart"));
        System.out.println(myFace); // 변경값이 변수에 저장되지는 않는다
        // 8. 문자열 반복하기
        // repeat(반복횟수)
        var nayana = "나야나!\n";
        // var로 선언하면 데이터에 따라 형을 자동으로 정해주는 선언 방법(Java10부터 도입)
        // 참고) 주로 사용되지는 않는다
        System.out.println(nayana.repeat(10));
        // 9. 문자열 연결
        // + 연산자를 문자열 사이에 사용하여 결합
        // 10. 문자열 연결 메서드 : concat()
        // 하나의 문자열에 이어서 문자열을 연결하는 메서드
        // ex)
        String name = "k";
        String name2 = "ost";
        String familyName = "kr.";
        System.out.println(familyName.concat(name));
        System.out.println(familyName.concat(name2));
        // 11. 특수문자 이스케이프 하기 (앞에 역슬래쉬사용!)
        // \' ' 홑따옴표
        // \" " 쌍따옴표
        // \\ \ 역슬래쉬
        // 참고) 기타 이스케이프 시퀀스
        // \n 개행
        // \r 엔터
        // \t 탭
        // \b 백스페이스
        System.out.println("\"\"");
        System.out.println("\'\'");
        // [ 수학 메서드 ] - Math 클래스 (정적객체)
        System.out.println("[ 수학 메서드 ]");
        // 1.Math.max( x,y ) - x 와 y 중 최대값
        System.out.println(Math.max(10, 20));
        // 2.Math.min( x,y ) - x 와 y 중 최소값
        System.out.println(Math.min(11, 22));
        // 3. Math.sqrt( x ) - 제곱근값
        System.out.println(Math.sqrt(2));
        // 4. Math.abs(x) - 절대값
        System.out.println(Math.abs(100 - 1000));
        // 5. Math.random() - 0.0(포함)과 1.0(제외) 사이의 난수
        // ceil() 올림, floor() 내림, round() 반올림
        System.out.println(Math.ceil(Math.random()*5));

    }
}
