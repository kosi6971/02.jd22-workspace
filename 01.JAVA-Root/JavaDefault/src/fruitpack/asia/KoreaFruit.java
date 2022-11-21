package fruitpack.asia;

import fruitpack.america.south.PeruFruit;

// import fruitpack.america.south.PeruFruit;

public class KoreaFruit extends PeruFruit {
    // extends는 상속 키워드이다
    // extends PeruFruit -> 페루가 슈퍼 클래스가 됨, 한국은 서브 클래스가 됨
    // 슈퍼 클래스 == 부모 클래스 ,  서브 클래스 == 자식 클래스
    public void koreaFn(){
        System.out.println("한국산 과일");

        // 페루의 protected 메서드를 호출할 수 있나? X
        // PeruFruit peru = new PeruFruit();
        // peru.peruFn(); -> 프로텍티드 메서드가 보이지도 않는다

        // 페루의 자식 클래스가 됐을 때 페루의 protected 메서드 호출 가능
        // 부모 클래스는 super 키워드로 부를 수 있다
        System.out.println("한국은 페루의 서브 클래스가 되어 호출");
        super.peruFnProtected();
    }
}
