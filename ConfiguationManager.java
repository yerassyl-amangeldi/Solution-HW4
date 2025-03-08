import java.util.HashMap;
import java.util.Map;


public class ConfigurationManager {
    // Single instance of the ConfigurationManager
    private static ConfigurationManager instance;
    // Configuration data stored as key-value pairs
    private Map<String, String> configMap;

    //private constructor to prevent instantiation
    private ConfigurationManager() {
        configMap = new HashMap<>();
        // Load hardcoded configuration settings
        configMap.put("maxPlayers", "100");
        configMap.put("defaultLanguage", "en");
        configMap.put("gameDifficulty", "medium");
    }


    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }


    public String getConfig(String key) {
        return configMap.get(key);
    }

    public void printAllConfigs() {
        System.out.println("Configuration Settings:");
        for (Map.Entry<String, String> entry : configMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}