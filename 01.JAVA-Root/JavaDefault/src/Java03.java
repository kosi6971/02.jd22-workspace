public class Java03 {
    public static void main(String[] args) {
        /*
            [ 자바 연산자 ] : 변수와 값에 대한 연산을 수행하는데 사용됨

            [1.산술 연산자] : 일반적인 수학 연산을 수행하는 데 사용
            +	더하기	x + y	
            -	빼기	x - y	
            *	곱하기	x * y	
            /	나누기	x / y	
            %	나머지	x % y	
            ++	1씩증가	++x	
            --	1씩감소	--x
        */
        System.out.println("[ 산술 연산자 ]");
        System.out.println("3+7*9/20-5="+(3+7*9/20-5));
        System.out.println("500/7...?="+(500%7));
        int worldNum = 78;
        System.out.println("worldNum : "+(worldNum++));
        System.out.println("worldNum : "+(++worldNum));
        System.out.println("worldNum : "+(worldNum--));
        System.out.println("worldNum : "+(--worldNum));


        // [2. 할당연산자] : = 오른쪽의 값을 왼쪽에 할당함!

        // [3. 대입연산자] : 기존값에 연산을 중첩함 -> += , -=, *=, /=, %=
        System.out.println("[ 대입 연산자 ]");
        System.out.println(worldNum+=10);

        // [4. 비교연산자] : >,<,==,!=,>=,<=
        System.out.println("[ 비교 연산자 ]");
        int broAge = 19, myAge = 18;
        System.out.println("broAge up? : "+(broAge>myAge));
        System.out.println("broAge up? : "+(broAge>myAge?"yes":"no"));

        // [5. 논리연산자] : &&(논리곱), ||(논리합), !(논리부정)
        System.out.println("[ 논리 연산자 ]");
        String man = "남자";
        int age = 20;
        System.out.println(man == "남자" && age >= 20);
        System.out.println(man == "남자" || age < 20);
        System.out.println(!(man == "남자" || age < 20));
    }
}
