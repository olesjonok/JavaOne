package lv.javaguru.demo.Validation;


public class UserValidationException extends RuntimeException {
    public UserValidationException(User user) {

        super("Wrong user name, surname or age. Check again. Name: " + user.getFirstName() + ". Surname: " + user.getLastName() + ". Ages: " + user.getAge());

    }
}
