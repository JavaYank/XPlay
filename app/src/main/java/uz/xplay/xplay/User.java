package uz.xplay.xplay;

public class User {

    private Integer id;
    private String name;
    private String pass;
    private int account_score;
    private String func;

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public User() {
    }

    public User(String name, String pass, String func) {
        this.name = name;
        this.pass = pass;
        this.func = func;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

