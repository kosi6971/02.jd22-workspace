package fruitpack.america.south;

public class ChileFruit {
    public void chileFn() {
        System.out.println("칠레산 과일");

        // 페루를 생성하여 호출 테스트
        PeruFruit peru = new PeruFruit();
        System.out.println("칠레에서 페루 호출");
        peru.peruFnProtected();
    }
}
