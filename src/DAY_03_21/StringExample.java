package DAY_03_21;

public class StringExample {
    public static void main(String[] args) throws Exception {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1.toUpperCase());
        s1 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s3.concat("world"));
        System.out.println(s3);
        System.out.println();
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);

        byte[] buffer = new byte[100];
        System.out.println("입력:");
        int readCount = System.in.read(buffer); // main에 throws Exception 추가
        System.out.println(buffer);
        String input = new String(buffer, 0, readCount);
        System.out.println(input.trim());
        System.out.println("--------------");
    }
}
