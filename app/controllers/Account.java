package controllers;

public class Account {
    private boolean DM = false;
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setDM(boolean player) {
        this.DM = player;
    }
    public boolean getDM(boolean player) {
        return this.DM;
    }

}
