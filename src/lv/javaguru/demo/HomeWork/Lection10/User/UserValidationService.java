package lv.javaguru.demo.HomeWork.Lection10.User;

public class UserValidationService {
    User user = new User();

    public void validate(User user) {
        if (user.getFirstName().length() < 3) {
            try {
                throw new UserValidationException("Error");
            } catch (UserValidationException e) {
                System.out.println("Name is less than 3 symbols!!!");
            }
        } else if (user.getLastName().length() > 15) {
            try {
                throw new UserValidationException("Error");
            } catch (UserValidationException e) {
                System.out.println("Surname is more than 15 symbols!!!");
            }
        } else if (user.getAge() < 0 || user.getAge() > 120) {
            try {
                throw new UserValidationException("Error");
            } catch (UserValidationException e) {
                System.out.println("Age of user can't be less than 0 and more than 120 years!!!");
            }
        } else {
            System.out.println("User name is correct!!\n" + "Result is: " + user);
        }
    }
}
