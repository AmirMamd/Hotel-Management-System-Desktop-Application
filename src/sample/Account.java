package sample;

public class Account {
    private String FullName;
    private String loginCode;

    public Account(String fullName, String loginCode) {
        FullName = fullName;
        this.loginCode = loginCode;
    }

    public Account() {

    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }
}
