package lv.javaguru.demo.HomeWork.Lection10.User;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message) {
        super(message);
    }
}

// непроверяемое исключение (Unchecked / RuntimeException). Содержит сообщение с причиной ошибки.