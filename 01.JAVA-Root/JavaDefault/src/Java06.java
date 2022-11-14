// Java06. 자바 메서드
public class Java06 {
    public static void main(String[] args) {
        /*
         * [ 자바 메서드 기본 특징 ]
         * 1. 메서드는 호출 시에만 실행되는 코드블록이다
         * 2. 매개변수를 데이터를 메서드에 전당한다
         * 3. 메서드는 특정 작업을 수행하는 함수로 볼 수 있다
         * 4. 메서드를 쓰는 이유는 코드의 재사용을 위해서이다
         * 5. 메서드 안에 메서드는 만들 수 없다(주의)
         * 
         * [ 메서드의 생성 ]
         * 1. 메서드는 클래스 내부에 선언한다
         * 2. 메서드의 이름과 소괄호, 중괄호로 구성한다
         * 3.자바에는 내장 메서드도 있고 사용자정의 메서드도 있다
         * 4. 메서드는 클래스와 구분하기 위해서 소문자로 시작한다
         * (보통 캐물케이스 즉, 두번째 단어부터 대문자로 쓴다)
         * 5. void는 메서드의 리턴값이 없다는 뜻
         * -> String/int 등의 데이터형을 쓰면 그 형의 리턴값이 있다는 뜻
         * 
         * [ 메서드의 매개변수 ]
         * 1. 특정 데이터를 메서드에 전달하는 변수이다
         * 2. 매개 변수는 메서드 내에서만 사용되는 지역 변수이다
         * 3. 매개변수는 변수형 선언과 함께 소괄호 안에 작성된다
         * 4. 매개변수 개수만큼 콤마로 구분하여 소괄호 안에 작성
         * 
         * [ main메서드 소개 ]
         * 1. 클래스에서 자동으로 가장 먼저 실행되는 메소드이다
         * 2. 메인 메서드에서 사용자 정의 메서드를 호출할 수 있다
         * 3. public 접근 제한자는 모든 클래스에서 접근할 수 있다는 표시
         * 4. static은 메서드가 클래스에 속해 있다(new키워드로 생성 안한다)
         * 
         * [ 메서드 오버로딩(Overloading) ]
         * 1. 메서드 이름이 같고 전달변수의 종류와 개수가 다른 메서드
         * 2. 호풀 시에 전달변수의 종류와 개수에 맞게 호출하면 된다
         * 3. 같은 이름의 메서드가 중복되어 로딩되므로 오버로딩이라고 한다
         * 4. 항상 오버라이딩(Overriding)과 비교하여 알아둬야 한다
         *    오버라이딩(Overriding)은 클래스상속에서 자식 클래스가 부모 클래스의
         *    메서드를 재정의하는 것이다(부모메서드를 자식이 올라탄다)
         * 
         * [ 메서드에서의 변수 사용 ]
         * 1. 메서드 내에서 선언된 변수는 메서드 내에서 어디서나 사용 가능하다
         * (단, 선언 할당 후 아래에서 사용가능하다. 위에서는 사용 불가)
         * 2. 메서드 바깥의 변수는 메서드 내에서 3가지로 호출된다
         *      1)static 메서드는 클래스 객체 생성 후 사용
         *      2) statix이 아닌 메서드는 바로 변수를 사영할 수 있다
         *      -> 이유 : static이 아닌 메서드는 객체 생성을 해야하므로
         *                클래스하위의 모든 멤버 변수에 접근할 수 있다
         *      3) 변수에 static을 사용하면 모든 메서드에서 바로 사용할 수 있다
         */

        // 나의 첫 메서드 출력
        myFirst();

        // 나의 두번째 메서드 출력
        System.out.println(mySecond("지", "상근"));

        // 나의 세번쨰 메서드 출력
        // static이 아니므로 본 클래스에 자동 소속되지 않고 객체형으로 생성해야 사용 가능
        // new 키워드로 생성한다
        // 클래스소속으로 생성해야한다
        // 사용법 : 클래스명 변수 = new 클래스명();
        // 클래스가 객체로 생성되어야 static이 아닌 메서드를 호출할 수 있다
        Java06 j06 = new Java06();
        System.out.println(j06.myThird(3, 10));

        // 나의 네번째 메서드 : 이달의 표어
        System.out.println(j06.makeTitle(1000, "끼룩"));
        // 이름이 같은 오버로딩 메서드
        System.out.println(j06.makeTitle(2004, "까악", "뭘봐"));
        System.out.println(j06.makeTitle(99.9));

        // 10에서 1까지 더한 결과 출력 재귀 메서드 호출
        System.out.println(sumNums(10));
    }

    // 클래스 멤버 변수 : 클래스 바로 아래 선언된 변수들(메서드 바깥에 있다)
    // -> 클래스의 속성(명사적 특징)에 해당

    // 1형 : 변수형으로만 선언 할당한 변수
    String newMsg = "레볼루션";
    // 2형 : static 선언 변수
    static String addMsg = "새롭게";

    // 나의 첫 메서드
    public static void myFirst() {
        // static 메서드가 static이 아닌 변수로 접근 시 객체를 생성해야 한다
        Java06 myOjt = new Java06();

        int myNum = 1000; // 위에 있을 것
        System.out.println("java 메서드 : kr.sil" + addMsg + myOjt.newMsg +myNum);
        // int myNum = 1000; 변수가 아래에 있으면 사용이 불가하다
    }

    // 나의 두번째 메서드
    public static String mySecond(String family, String name) {
        return family + "씨 가문 " + name;
    }

    // 나의 세번째 메서드 -> static이 없음
    public int myThird(int a, int b){
        return a*b;
    }

    // 나의 네번째 메서드 : 표어 만들기
    public String makeTitle(int num, String msg){
        return num + "번 " + msg + newMsg + addMsg;
    }

    // 표어만들기를 똑같이 하는데 내용이 다르므로 전달값도 다르다
    // 메서드 명이 똑같다 -> 오버로딩 메서드
    public String makeTitle(int mon, String evt, String peo){
        return mon + "my" + evt + "kosi " + peo + " kr.sil ";
    }

    public String makeTitle(double ndata){
        return ndata + "% kosi";
    }

    // 재귀 메서드 -> 메서드 자기자신을 다시 호출하여 결과를 만드는 메서드
    // 1부터 10까지 더하여 그 결과를 화면에 계산식과 함께 출력
    // 바로 호출 가능한 static 메서드로 만들기
    public static int sumNums(int num){ // 10부터 1까지 더한다면 10이 들어온다
        // 재귀호출
        if(num > 0){
            // 중간 계산식 만들기 : 1이 되기까지 + 기호로 연결
            System.out.print(num+(num==1 ? "=":"+"));
            return num+sumNums(num - 1);
        }
        else return num;
    }
}