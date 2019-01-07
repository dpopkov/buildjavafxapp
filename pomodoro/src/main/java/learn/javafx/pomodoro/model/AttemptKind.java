package learn.javafx.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60),
    BREAK(5 * 60);

    private final int totalSeconds;

    AttemptKind(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }
}
