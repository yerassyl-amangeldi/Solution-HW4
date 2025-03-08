

public class ChatAdapterDemo {
    public static void main(String[] args) {
        // Create an instance of the legacy chat service
        LegacyChatService legacyService = new LegacyChatService();

        // Wrap the legacy service with the adapter
        ChatService chatService = new ChatServiceAdapter(legacyService);

        chatService.sendMessage("Hello world!");
    }
}