package DAY_03_22.enumEx;

public class EnumExample {
    public static void main(String[] args) {
        Coin coin = Coin.NICKEL;
        System.out.println(coin);
        System.out.println(coin.getValue());
        buy(coin);
        //buy(5); // enum을 사용하기 전
        buy(coin.getValue());
    }

    public static void buy(int coin){ // buy(Coin coin)로부터 함수가 호출됨
        System.out.println("호출 당함");
        System.out.println("복잡하고 새로 구현할 수 없는 기능");
        System.out.println("구매 완료");
    } // 레거시 : 예전에 있던 메서드

    public static void buy(Coin coin) {
        System.out.println("여기부터 호출");
        buy(coin.getValue()); // buy(coin);로부터 인자를 넘겨받아서 위에 있는 함수 호출
        System.out.println("구매 완료 2");
    } // 신규 기능
}
