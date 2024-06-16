package DAY_03_22.fileStream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;

public class filterExample {
    public static void main(String[] args) {
        //  파일을 저장하는 3가지 방법
        Member m = new Member("홍길동", "hong@hong.com", 30, "서울시 강동구");
        Member m2 = new Member("홍길서", "west@hong.com", 25, "서울시 강서구");
        // 파일에 저장 => File이 노드가 됨

        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m);
        memberList.add(m2);

        FileOutputStream fos = null;

        try {
//            fos = new FileOutputStream("member.txt");

//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            bos.write(m.toJSON().getBytes());
//            bos.write("\n".getBytes());
//            bos.write(m2.toJSON().getBytes());
//            bos.flush(); // 남은 데이터 다읽음

//            DataOutputStream dos = new DataOutputStream(fos); // 단순 txt, 형변환을 안해도되지만, 다르문제도 몼고 단순 txt밖에 취급안되서 안씀.
//            dos.writeUTF(m.getName());
//            dos.writeUTF(m.getEmail());
//            dos.writeInt(m.getAge()); // 숫자는 처리를 못해서 다르 문자로 대체되어 꺠진다.
//            dos.writeUTF(m.getAddress());
//            dos.flush();
            fos = new FileOutputStream("member.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(memberList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try{fos.close();} catch(Exception e) { }
        }
        System.out.println("저장 완료");

        // 불러오기
        FileInputStream fis = null;
        try {
//            fis = new FileInputStream("member.txt");

//            BufferedInputStream bis = new BufferedInputStream(fis);
//            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//            String line = br.readLine();
//            String[] tokens = line.split(",");
//            String name = tokens[0];
//            String email = tokens[1];
//            int age = Integer.parseInt(tokens[2]);
//            String address = tokens[2];

//            DataInputStream dis = new DataInputStream(fis);
//            String name = dis.readUTF();
//            String email = dis.readUTF();
//            int age = dis.readInt();
//            String address = dis.readUTF();

//            Member m1 = new Member(name, email, age, address);
//            System.out.println(m1.toString());

            fis = new FileInputStream("member.data");
            ObjectInputStream oos = new ObjectInputStream(fis);
            ArrayList<Member> list = (ArrayList<Member>)oos.readObject();
            for(Member member : list){
                System.out.println(member.toString());
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {fis.close();} catch (Exception e){}
        }
    }
}

@Data @AllArgsConstructor
class Member implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 7250384070186006032L; // 한번 객체를 만들었는데 나중에 객체 구조가 바뀌어도 같은 객체라고 인지하게 하기위해서
    private String name;
    private String email;
    private int age;
    private String address;

    public String toJSON(){
        return name + "," + email + "," + age + "," + address;
    }
}
