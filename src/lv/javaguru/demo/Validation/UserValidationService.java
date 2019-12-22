package lv.javaguru.demo.Validation;


public class UserValidationService {
    public void validate(User user) throws UserValidationException {
        if ((user.getAge() <= 120 && user.getAge() >= 0) &&
                user.getFirstName().length() >= 3 && user.getFirstName().length() <= 15 &&
                user.getLastName().length() >= 3 && user.getLastName().length() <= 15) {
            System.out.println("Name: " + user.getFirstName() + ". Surname: " + user.getLastName() + ". Ages: " + user.getAge());
        } else {
            throw new UserValidationException(user);
        }
    }
}
