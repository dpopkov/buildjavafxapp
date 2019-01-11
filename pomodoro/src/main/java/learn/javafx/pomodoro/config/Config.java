package learn.javafx.pomodoro.config;

import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

public class Config {
    private static final String POMODORO_HOME = ".apps_fx/pomodoro";
    private static final String PROPERTIES_FILE_NAME = "pomodoro.properties";
    private static final String FOCUS_MINUTES = "focus-minutes";
    private static final String FOCUS_MINUTES_DEFAULT = "25";
    private static final String BREAK_MINUTES = "break-minutes";
    private static final String BREAK_MINUTES_DEFAULT = "5";

    private static Config instance;

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private final Properties settings;

    private Config() {
        settings = new Properties();
        File file = tryToFindPropertiesFile();
        if (file != null) {
            try (InputStream in = new BufferedInputStream(new FileInputStream(file))) {
                settings.load(in);
            } catch (FileNotFoundException e) {
                /* This should not happen. */
                throw new RuntimeException("Properties file nod found", e);
            } catch (IOException e) {
                throw new RuntimeException("IOException", e);
            }
        }
    }

    private File tryToFindPropertiesFile() {
        File file = new File(PROPERTIES_FILE_NAME);
        if (file.exists()) {
            return file;
        }
        String userHome = System.getProperty("user.home");
        file = Paths.get(userHome, POMODORO_HOME, PROPERTIES_FILE_NAME).toFile();
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public int getFocusMinutes() {
        return Integer.parseInt(settings.getProperty(FOCUS_MINUTES, FOCUS_MINUTES_DEFAULT));
    }

    public int getBreakMinutes() {
        return Integer.parseInt(settings.getProperty(BREAK_MINUTES, BREAK_MINUTES_DEFAULT));
    }
}
