package DAY_03_22.fileStream;

import java.io.*;

public class FileExample {
    public static void main(String[] args) throws Exception { // 에외처리를 배우는 단원이 아니기때문에, throws Exception사용한것. 실제론 x
        OutputStream os = new FileOutputStream("test1.txt");
        String str = new String("Hello");
        // Hello가 적힌 test1.txt파일을 생성할거
        
        byte[] bytes = str.getBytes();

        os.write(bytes); // Hello가 적힌 test1.txt파일이 저장됨
        os.close();
        System.out.println("test1.txt 파일에 저장되었습니다.");

        Writer out = new FileWriter("test2.txt");
        out.write(str);
        out.close();
        System.out.println("test2.txt 파일에 저장되었습니다.");

        System.out.println("----------------------------");

        InputStream is = new FileInputStream("test1.txt");
        byte[] buffer = new byte[3];
        int readCount = 0;
        StringBuilder sb = new StringBuilder();
        readCount = is.read(buffer);
        while(readCount >= 0){
            String s1 = new String(buffer, 0, readCount);
            sb.append(s1);
            readCount = is.read(buffer);
        }
        System.out.println(sb.toString());
        is.close();
//        System.out.println(new String(buffer, 0, readCount));
    }
}
