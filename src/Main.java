import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Use a lowercase name for the variable to avoid conflicts
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Please provide any input: ");

        // readLine() requires exception handling (throws IOException)
        String text = br.readLine();

        System.out.println("Hello, My name is Bank Panachai");
        System.out.println("I'm living in Bangkok, Thailand");
        System.out.println("User Input: " + text);
    }
}