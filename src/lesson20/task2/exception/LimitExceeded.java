package lesson20.task2.exception;

public class LimitExceeded extends BadRequestEx {

    public LimitExceeded(String message) {
        super(message);
    }
}
