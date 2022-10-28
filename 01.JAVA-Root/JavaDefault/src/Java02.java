public class Java02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("자바 변수");

        // 1. 문자형
        String nameK = "kosi is happy";
        System.out.println(nameK);

        // 2. 정수형
        int myNum = 6971;
        System.out.println(myNum+" 행운의 숫자");
        myNum = 1264;
        System.out.println(myNum+" 행운의 숫자");
        // 자바 상수
        final int newNum = 5742;
        // final는 변수 앞에 사용하며 변수를 고정 시킨다
        // newNum = 2400; 에러가 난다
        System.out.println(newNum+" 상수");

        // 변수와 문자의 결합
        String nameKosi = "kosi";
        System.out.println("home " + nameKosi);
        String familyName = "kr.";
        String myName = "sil";
        String fullName = familyName + myName;
        System.out.println(fullName);

        // 변수 한번에 선언
        int x = 5, y = 6, z = 50;
        System.out.println(x + "와 " + y + "와 " + z + "의 합은 " + (x+y+z));
        // 다른 방법 - 같은 형의 변수를 한번에 선언 > 여러 변수에 같은 값 할당
        int xx, yy, zz;
        xx = yy = zz = 50;
        System.out.println(xx + "와 " + yy + "와 " + zz + "의 값");

        /*
        [ 자바 변수 ]
        변수는 데이터 값을 저장하기 위한 컨테이너

        [ 변수의 선언과 사용형식 ]
        데이터형 변수명 = type에 맞는 값

        [ Java 변수 유형 ]
        1. String - "Hello"와 같은 텍스트를 저장 문자열 값은 큰따옴표사용!
        2. int - 123 또는 -123과 같이 소수 없이 정수(정수)를 저장
        3. float - 19.99 또는 -19.99와 같은 소수를 사용. 부동 소수점 숫자를 저장
        4. char - 'a' 또는 'B'와 같은 단일 문자를 저장. Char 값은 작은따옴표사용!
        5. boolean - true / false

        [ 변수 이름 규칙 ]
        1. 문자, 숫자, 밑줄 및 달러 기호 포함가능
        2. 문자로 시작
        3. 소문자로 시작 - 대문자 시작은 class이다
        4. 중간 공백 안됨
        5. $ 및 _로 시작할 수도 있음
        6. 대소문자를 구분
        7. 예약어사용불가 

        [ 데이터 유형 ] -> 두 그룹으로 나뉩니다.

        1. 기본 데이터 유형 (8가지)
        (1) byte	1 byte	 -128 ~ 127
        (2) short	2 bytes	 -32,768 ~ 32,767
        (3) int		4 bytes	 -21억 ~ 21억
        (4) long	8 bytes	 -9백경 ~ 9백경
        (5) float	4 bytes	 소수 6 to 7 자릿수
        (6) double	8 bytes	 소수 15 자릿수
        (7) boolean	1 bit	 true / false
        (8) char	2 bytes	 한문자 or 아스키값
        ->>> (질문) Java에는 많은 숫자 유형이 있지만 숫자에 가장 많이 사용되는 유형은? 
        (답) int(정수) 및 double(부동 소수점 숫자)

        2. 기본이 아닌 데이터 유형 - String, 배열 및 클래스 등
        * String 유형은 Java에서 너무 많이 사용되고 통합되어 
        * 일부에서는 이를 "특별한 아홉 번째 유형"이라고 불리움. (기본유형이 8개 이므로^^)
        * Java의 String은 객체를 참조하기 때문에 실제로는 
        * 기본이 아닌 데이터 유형 String 객체에는 문자열에 대한 
        * 특정 작업을 수행하는데 사용되는 메서드가 있음.
        */
        int iamInt = 5;
        float iamFloat = 5.99f;
        char iamChar = 'K'; // ""는 char에서 사용 불가
        boolean iamBoolean = true;
        String iamString = "kr.sil";

        System.out.println("정수 : " + iamInt);
        System.out.println("실수 : " + iamFloat);
        System.out.println("한글자 : " + iamChar);
        System.out.println("불린 : " + iamBoolean);
        System.out.println("문자 : " + iamString);

        // 데이터형별 크기 체크
        System.out.println("[ 데이터형별 크기 체크 ]");
        // 1. byte : -128 ~ 127
        byte numByte = 127;
        System.out.println("byte : " + numByte);
        // 2. short : -32768 ~ 32767
        short numShort = 32767;
        System.out.println("short : " + numShort);
        // 3. int : -2147483648 ~ 2147483647
        int numInt = 2147483647;
        System.out.println("int : " + numInt);
        // 4. long : -9223372036854775808 ~ 9223372036854775807
        long numLong = 9223372036854775807L;
        // 특이사항 -> 범위 안의 숫자일지라도 끝에 L을 넣지 않으면 int형으로 처리
        // 끝에 L을 넣을 것(소문자도 가능 but 1과 구분하기 힘들수도 있다)
        System.out.println("long : " + numLong);
        // 5. float : 소수 6~7
        float numFloat = 9.1234567f; // => 9.123457
        // 특이사항 -> 끝에 f을 넣을 것(대문자도 가능)
        // 범위 오버 시, 반올림
        System.out.println("float : " + numFloat);
        // 6. double : 소수 15
        double numDouble = 9.123456789012345d;
        // 특이사항 -> 끝에 d을 넣을 것(대문자도 가능)
        // float이나 double은 근사값이므로 끝자리 수가 달라질 수 있다
        System.out.println("double : " + numDouble);

        // 과학적인 10의 거듭제곱 표시 사용가능(e+자릿수)
        // float이나 double은 소수점이 없으면 기본 한자릿수 표시
        float f1 = 35e3f;
        double d1 = 12e4d;
        System.out.println("거듭제곱 :\n"+f1+"\n"+d1);

        System.out.println("[ 불린값 출력 ]");
        // 불린값(true / false)
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isJavaFun?"kosi":"kr.sil");
        System.out.println(isFishTasty);
        System.out.println(isFishTasty?"kosi":"kr.sil");

        // char 데이터 유형
        // 문자는 ''사용 필수
        System.out.println("[ char값 출력 ]");
        char myGrade = 'K';
        System.out.println(myGrade);
        // 한글 같은 2byte 문자도 한글자 씩 출력
        char myMedal = '상';
        System.out.println(myMedal);

        // 아스키코드를 이용한 출력
        // char형에 아스키코드에 해당하는 숫자를 넣으면 한글자 출력
        // 참조 : https://www.w3schools.com/charsets/ref_html_ascii.asp
        char myVar1 = 64, myVar2 = 66, myVar3 = 67;
        System.out.println("아스키 64 : "+myVar1);
        System.out.println("아스키 66 : "+myVar2);
        System.out.println("아스키 67 : "+myVar3);

        /*
        [ 기본이 아닌 데이터 유형 ]
        기본이 아닌 데이터 형식은 개체를 참조하기 때문에 
        참조 형식 이라고함.
        (기본 데이터 유형 과 기본 이 아닌 데이터 유형 의 주요 차이점)

        기본 유형은 Java에서 사전 정의(이미 정의)되어 있음 
        기본이 아닌 유형은 프로그래머에 의해 생성되며 
        Java에 의해 정의되지 않음( 제외 String).

        기본 유형이 아닌 유형은 특정 작업을 수행하기 위해 
        메소드를 호출하는 데 사용할 수 있지만 기본 유형은 불가능함

        기본 유형에는 항상 값이 있는 반면 기본 유형이 아닌 유형은 null.
        기본 유형은 소문자로 시작하고 기본 유형이 아닌 유형은 대문자로 시작.
        기본 유형의 크기는 데이터 유형에 따라 달라지지만 
        기본 유형이 아닌 유형은 모두 동일한 크기를 갖음.

        기본이 아닌 유형의 예로는 Strings / Arrays / Classes / Interface 등이 있음
        */ 


        /*
            [ 데이터 형변환 ]
            형변환은 기본 데이터 유형의 값을 다른 유형에 할당하는것
            Java에는 두 가지 유형의 캐스팅이 있음
            1.업캐스팅 (자동) 
            - 더 작은 유형을 더 큰 유형 크기로 변환
            byte-> short-> char-> int-> long-> float->double
            2.다운캐스팅 (수동) 
            - 큰 유형을 작은 크기 유형으로 변환
            double-> float-> long-> int-> char-> short->byte 
        */

        // 형변환
        // 1. 업케스팅 : 자동형 변환
        System.out.println("[ 업케스팅 ]");
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // 2. 다운케스팅 : 수동형 변환
        // 타입 변수 = (뱐환타입) 변수
        System.out.println("[ 다운케스팅 ]");
        double myDouble2 = 9.78d;
        int myInt2 = (int)myDouble2;
        System.out.println(myDouble2);
        System.out.println(myInt2);

    }
}   
