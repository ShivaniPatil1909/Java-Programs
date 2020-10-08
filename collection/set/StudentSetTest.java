package collection.set;
import java.util.*;

public class StudentSetTest {
	static public void main(String ar[]){
		Student s1 = new Student(12, "Brijeshwar");
		System.out.println(s1);
		
		Set<Student> studSet = new HashSet<Student>();
		studSet.add(s1);
		System.out.println("------------------");
		studSet.add(new Student(12, "Nitin"));
		System.out.println("------------------");
		studSet.add(new Student(12, "Neetin"));
		System.out.println("------------------");
		studSet.add(new Student(32, "Monica"));
		System.out.println("------------------");
		
		System.out.println(studSet);
		//for(Student s: studSet)
		//	System.out.println(s);
		
		
		
		
	}
	

}
