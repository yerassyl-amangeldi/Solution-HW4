

public class ConfigManagerDemo {
    public static void main(String[] args) {
        // Get the singleton instance
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Test retrieving individual configuration values
        System.out.println("Max Players: " + configManager.getConfig("maxPlayers"));
        System.out.println("Default Language: " + configManager.getConfig("defaultLanguage"));
        System.out.println("Game Difficulty: " + configManager.getConfig("gameDifficulty"));

        // Test printing all configurations
        configManager.printAllConfigs();
    }
}