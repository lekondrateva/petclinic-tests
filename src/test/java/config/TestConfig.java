package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestConfig {
    private static final Properties props = new Properties();

    static {
        try (InputStream input = TestConfig.class.getClassLoader().getResourceAsStream("config.properties")) {
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Can't load config.properties", e);
        }
    }

    public static String getBaseUrl() {
        return props.getProperty("base.url");
    }

    public static String getApiUrl() {
        return props.getProperty("api.url");
    }
}
