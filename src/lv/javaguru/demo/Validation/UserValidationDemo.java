package lv.javaguru.demo.Validation;

import lv.javaguru.demo.HomeWork.Lection10.User.User;
import lv.javaguru.demo.HomeWork.Lection10.User.UserValidationException;
import lv.javaguru.demo.HomeWork.Lection10.User.UserValidationService;

public class UserValidationDemo {
    public static void main(String[] args) {

        UserValidationService userValidationService = new UserValidationService();
        try {
            User user = new User("Ok", "Petrov", 1);
            userValidationService.validate(user);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("Masha ", "Pl", 136);
            userValidationService.validate(user);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("Masha ", "Petrova", 13);
            userValidationService.validate(user);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
