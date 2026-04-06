package j031.model;

public class User {
    private String userid = "";
    private String password = "";
    private String name = "";

    public User(String userid, String password, String name){
        this.userid = userid;
        this.password = password;
        this.name = name;
    }

    public boolean checkPW(){
        return password.length() >= 3;
    }

    public String getMaskedPW(){
        String result = "";

        for(int i = 0; i < password.length(); i++){
            if(i < 2){
                result += password.charAt(i);
            } else {
                result += "*";
            }
        }

        return result;

    }

    public String getUserid(){
        return userid;
    }

    public String getName(){
        return name;
    }
}


