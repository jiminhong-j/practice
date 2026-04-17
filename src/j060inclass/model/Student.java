package j060inclass.model;

public class Student {
    // student id(sid), name
    // 멤버변수
    private String name;
    private String id;

    // 생성자
    public Student() {} // 기본 생성자

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    // getter & setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }


    // toString
    @Override
    public String toString(){
        return "Student [name=" + name + ", id =" + id + "]";
    }

}
