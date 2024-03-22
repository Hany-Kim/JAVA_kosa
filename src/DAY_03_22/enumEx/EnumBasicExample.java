package DAY_03_22.enumEx;

public class EnumBasicExample {
    public static void main(String[] args) {
        Coin coin = Coin.DIME;

        switch (coin){
            case PENNY:
                System.out.println("1센트 동전입니다.");
                break;
            case NICKEL:
                System.out.println("5센트 동전입니다.");
                break;
            case DIME:
                System.out.println("10센트 동전입니다.");
                break;
            case QUARTER:
                System.out.println("25센트 동전입니다.");
                break;
            default:
                break;
        }
    }
}
