package fruitpack.america.south;

public class PeruFruit {
    public void peruFn(){
        System.out.println("페루산 과일");
        // 프라이빗 메서드는 선언된 클래스에서만 사용 가능
        System.out.println("페루에서 호출");
        peruFnPrivate();
        // 프로텍티드 메서드도 당연히 호출 가능
        System.out.println("페루에서 호출");
        peruFnProtected();
    }

    // 프라이빗 메서드 만들기
    private void peruFnPrivate(){
        System.out.println("페루산 과일 private");
    }
    // 프로텍디스 메서드 만들기
    protected void peruFnProtected(){
        System.out.println("페루산 과일 protected");
    }
}
