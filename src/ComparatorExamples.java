import java.util.*;
public class ComparatorExamples { static class Student{String name;int marks;Student(String n,int m){name=n;marks=m;}public String toString(){return name+":"+marks;}}public static void main(String[]a){List<Student>s=new ArrayList<>(Arrays.asList(new Student("B",70),new Student("A",90)));s.sort(Comparator.comparingInt(x->x.marks));System.out.println(s);}}
