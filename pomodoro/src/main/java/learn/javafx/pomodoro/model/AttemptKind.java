package learn.javafx.pomodoro.model;

import learn.javafx.pomodoro.config.Config;

public enum AttemptKind {
    FOCUS(Config.getInstance().getFocusMinutes() * Constants.SECONDS_PER_MINUTE, "Focus time"),
    BREAK(Config.getInstance().getBreakMinutes() * Constants.SECONDS_PER_MINUTE, "Break time");

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

    private static class Constants {
        public static final int SECONDS_PER_MINUTE = 60;
    }
}
