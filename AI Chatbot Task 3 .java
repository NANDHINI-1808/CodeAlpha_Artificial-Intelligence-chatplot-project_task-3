// ChatBot.java
public class ChatBot {
    private String name;

    public ChatBot() {
        this.name = "ChatBot";
    }

    // Generates a response based on user input
    public String getResponse(String input) {
        String lower = input.toLowerCase();  // normalize input to lower case

        // Simple rule-based matching
        if (lower.contains("hello") || lower.contains("hi") || lower.contains("hey")) {
            return "Hello! How can I assist you today?";
        } else if (lower.contains("how are you")) {
            return "I'm just a program, but I'm doing well!";
        } else if (lower.contains("your name") || lower.contains("who are you")) {
            return "I am " + name + ", your friendly chatbot.";
        } else if (lower.contains("help")) {
            return "I'm here to chat with you. You can ask me anything!";
        } else if (lower.contains("bye")) {
            return "Goodbye! It was nice talking to you.";
        } else {
            return "I'm sorry, I don't understand. Can you rephrase?";
        }
    }

    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("ChatBot: Hello! I am a simple chatbot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput == null) {
                break;
            }
            String response = bot.getResponse(userInput);
            System.out.println("ChatBot: " + response);
            // Exit loop if user said 'bye'
            if (userInput.toLowerCase().contains("bye")) {
                break;
            }
        }
        scanner.close();
        System.out.println("ChatBot: Session ended.");
    }
}
