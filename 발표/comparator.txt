package report2;

import java.util.*;

public class Comparat {
    public static void main(String[] args){
        Student s1 = new Student("VeryVeryLongName", 5);
        Student s2 = new Student("SomeLongName", 2);
        Student s3 = new Student("Michael", 3);
        Student s4 = new Student("Aiden", 4);
        Student s5 = new Student("Adam", 1);

        List<Student> list = new ArrayList<>();
        list.add(s2);
        list.add(s5);
        list.add(s4);
        list.add(s1);
        list.add(s3);
        
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("#########################################");
        
        // Comparator 하기 전 compareTo로 정렬
        Collections.sort(list);
        Iterator<Student> iterator2 = list.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        
        System.out.println("#########################################");

        // Comparator 부분
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().length() - o1.getName().length();
            }
        };
        
        //Comparator 사용 후 정렬
        Collections.sort(list, comparator);
        Iterator<Student> iterator3 = list.iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }
}

class Student  implements Comparable<Student> {
    private String name;
    private int number;
    public Student(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }

    @Override
    public String toString(){
        return name + " : " + number;
    }    
    //compareTo()메소드 부분
    @Override
    public int compareTo(Student student){
        return this.number - student.number;
    }

}