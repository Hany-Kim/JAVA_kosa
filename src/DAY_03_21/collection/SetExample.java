package DAY_03_21.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        String s1 = new String();
        ts.add(s1);
        ts.add("hello");
        ts.add("banana");
        for(String str : ts){
            System.out.println(str);
        }
        // Tree에 추가되어야 하는 데이터는 비교 가능한 객체여야 함.
        // Comparable


    }
}

@Data
@AllArgsConstructor
class Emp implements Comparable<Emp> {
    private String empId;
    private String ename;
    private double salary;
    @Override
    public int compareTo(Emp o) {
        // id 순으로 정렬
        //return empId.compareTo(o.empId); // 객체가 정렬되기 위한 코드 (정렬하기 위한 방법을 저장)

        // 급여 순으로 정렬
        return (int)(this.salary - o.salary); // 객체가 정렬되기 위한 코드 (정렬하기 위한 방법을 저장)

        // 이름 순으로 정렬
        //return ename.compareTo(o.ename); // 객체가 정렬되기 위한 코드 (정렬하기 위한 방법을 저장)
    }
}
