package lv.javaguru.demo.HomeWork.User;

import java.util.Scanner;

public class UserLoginService {
    private String password;

    public UserLoginService(String pass) {
        System.out.println("Enter your password:");
        this.password = new Scanner(System.in).next();
        if (pass.equals(this.password)) {
            System.out.println("User password is correct");
        } else {
            System.out.println("Invalid password");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}
