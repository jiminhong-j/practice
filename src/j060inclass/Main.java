package j060inclass;

import j060inclass.model.Student;
import j060inclass.service.StudentManager;

public class Main {
    public static void main(String[] args) {
        // 추가
    //    ArrayList<Student> list = new ArrayList<>();

    //    Student s1 = new Student("홍길동", "21800001");
    //    list.add(new Student("홍길동", "21800001"));

    //    Student s2 = new Student("고길동", "21800002");
    //    list.add(new Student("고길동", "21800002"));

    //    System.out.println(list.size());

        // 출력
    //    for(int i = 0; i < list.size(); i++){
    //        System.out.println(list.get(i)); // Student type이 꺼내짐, 마지막에 toString 돼서 출력
        StudentManager manager = new StudentManager();

        manager.add(new Student("홍길동", "2180001"));
        manager.add(new Student("고길동", "2180002"));

        manager.print();
    }
}
