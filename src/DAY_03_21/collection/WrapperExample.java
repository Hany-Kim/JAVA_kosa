package DAY_03_21.collection;

public class WrapperExample {
    public static void main(String[] args) {
        Integer i1 = 100;
        int i2 = i1;
        Integer i3 = Integer.parseInt("100");

        int data1 = 2000;
        int data2 = 2000;
        System.out.println(data1 == data2); // true
        Integer data3 = 1000;
        Integer data4 = 1000;
        System.out.println(data3 == data4); // false
        Integer data5 = 100;
        Integer data6 = 100;
        System.out.println(data5 == data6); // true

        System.out.println(Math.random());

    }
}
