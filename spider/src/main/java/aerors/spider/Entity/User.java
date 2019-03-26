package aerors.spider.Entity;

public class User {

    private  String userName;
    private  String userPwd;
    private  Integer age;
    private  String gender;

    public User(String userName, String userPwd, Integer age) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
