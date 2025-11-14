package tudelft.doda2025.team21;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VersionUtil {

    private static final String VERSION;

    static {
        String v = "unknown";
        try (InputStream is = VersionUtil.class
                .getClassLoader()
                .getResourceAsStream("version.properties")) {

            if (is != null) {
                Properties props = new Properties();
                props.load(is);
                v = props.getProperty("version", v);
            }
        } catch (IOException e) {
            // 这里简单处理，真实项目可能要 log
        }
        VERSION = v;
    }

    public static String getVersion() {
        return VERSION;
    }
}
