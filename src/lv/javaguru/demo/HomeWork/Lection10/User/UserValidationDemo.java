package lv.javaguru.demo.HomeWork.Lection10.User;

public class UserValidationDemo {
    UserValidationService userValidationService = new UserValidationService();

    public static void main(String[] args) {
        UserValidationDemo userValidationDemo = new UserValidationDemo();
        userValidationDemo.test1();
        System.out.println("");
        userValidationDemo.test2();
        System.out.println("");
        userValidationDemo.test3();
    }
    public void test1 () {
        User user = new User("Ol", "Vasiljeva", 34);
        System.out.println("First User Result:");
        userValidationService.validate(user);
    }
    public void test2 () {
        User user = new User("Olesja", "Vasiljeva-hjgjgjh", 340);
        System.out.println("Second User Result:");
        userValidationService.validate(user);
    }
    public void test3 () {
        User user = new User("Olesja", "Vasiljeva", 34);
        System.out.println("Third User Result:");
        userValidationService.validate(user);
    }
}
