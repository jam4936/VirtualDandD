package controllers;

public class LoginForm {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(Account user){
        String name = user.getUserName();
        String pswd = user.getPassword();
        return userName.equals(name) || password.equals(pswd);
    }

    /*public Result loggin() {
        return ok(views.html.login.render());
    }*/

}
