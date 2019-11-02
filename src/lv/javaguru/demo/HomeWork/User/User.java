package lv.javaguru.demo.HomeWork.User;

import java.util.Scanner;

public class User {
    private String userName;

    public User (){
        this.userName = "Olesja";
    }

    public User(String name) {
        System.out.println("Enter your login:");
        this.userName = new Scanner(System.in).next();
        if (name.equals(this.userName)) {
            System.out.println("Name is correct");
        } else {
            System.out.println("Invalid name");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

}
