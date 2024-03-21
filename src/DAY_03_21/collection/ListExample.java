package DAY_03_21.collection;

import DAY_03_21.collection.SetExample;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add(1, "Nice");
        System.out.println(myList);

        List<String> myList2 = new LinkedList<String>();
        myList2.add("Hello");
        myList2.add("World");
        myList2.add(1, "Nice");
        System.out.println(myList2);

        List empList = new ArrayList();
        empList.add(new Emp("1221", "Foo", 10000));
        Object emp = empList.get(0);
        System.out.println(emp.toString());
        // System.out.println(emp.getSalary); // 오류
		/*
		if(emp instanceof Emp) {
			System.out.println(((Emp)emp).getSalary()); // 제네릭 사용
		}
		*/
        if(emp instanceof Emp emp_) { // 14버전부터
            System.out.println(emp_.getSalary());
        }
        Emp emp2 = (Emp)empList.get(0);
        System.out.println(emp2.toString());
        System.out.println(emp2.getSalary());

    }
}
