package learn.javafx.pomodoro.model;

public class Attempt {
    private String message;
    private final int remainingSeconds;
    private final AttemptKind kind;

    public Attempt(String message, AttemptKind kind) {
        this.message = message;
        this.kind = kind;
        remainingSeconds = kind.getTotalSeconds();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public AttemptKind getKind() {
        return kind;
    }
}
