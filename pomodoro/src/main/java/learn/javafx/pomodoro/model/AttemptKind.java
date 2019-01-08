package learn.javafx.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60, "Focus time"),
    BREAK(5 * 60, "Break time");

    private final int totalSeconds;
    private final String displayName;

    AttemptKind(int totalSeconds, String displayName) {
        this.totalSeconds = totalSeconds;
        this.displayName = displayName;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public String getDisplayName() {
        return displayName;
    }
}
