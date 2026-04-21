package j031.model;

public class User {
    private String userid;
    private String password;
    private String name;
    private String result = "";

    // constructor
    public User(String userid, String password, String name){
        this.userid = userid;
        this.password = password;
        this.name = name;
    }

    // getter setter

    public boolean checkPW(){
        return password.length() >= 3;
    }

    public String getPW(){

        for(int i = 0; i < password.length(); i++){
            if(i < 2){
                result += password.charAt(i);
            } else {
                result += "*";
            }
        }

        return result;
    }

    public void print(){
        System.out.println("User Id: " + userid);
        System.out.println("Password: " + result);
        System.out.println("User Name: " + name);
    }

}