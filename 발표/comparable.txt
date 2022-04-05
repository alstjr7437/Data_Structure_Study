package report2;

import java.util.*;

public class compare {
    public static void main(String[] args){
    	//객체 생성
        Student2 s1 = new Student2("Adam", 1);
        Student2 s2 = new Student2("Aiden", 2);
        Student2 s3 = new Student2("Michael", 3);

        //무작위 객체 배열로 추가
        List<Student2> list = new ArrayList<>();
        list.add(s2);
        list.add(s1);
        list.add(s3);

        //정렬 전 출력
        Iterator<Student2> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("#########################################");

        //정렬
        Collections.sort(list);
        
        //정렬 후 출력
        Iterator<Student2> iterator2 = list.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("#########################################");

        //compareTo 확인 부분
        int retVal = s1.compareTo(s2);
        int retVal2 = s3.compareTo(s2);

        System.out.println(retVal);
        System.out.println(retVal2);
        
    }
}

class Student2 implements Comparable<Student2>{
	//선언
    private String name;
    private int number;
    public Student2(String name, int number){
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
    public int compareTo(Student2 student){
        return this.number - student.number;
    }
}