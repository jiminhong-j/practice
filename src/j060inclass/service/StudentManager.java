package j060inclass.service;

import j060inclass.model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager {
    private ArrayList<Student> list = new ArrayList<>();

    public void start(){
        System.out.println("프로그램 시작");

    }
    public void add(Student student){
        list.add(student);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public void add(Object obj) {
        list.add((Student)obj);
    }

    @Override
    public void remove(int i) {
        list.remove(i);
    }
}
