import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "welcome to caeser cipher encryption and decryption";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Scanner input = new Scanner(System.in);
        //word
        System.out.println("enter a sentence or a word");
        String stringUserEntered = input.nextLine();
        //key
        System.out.println("enter a number as key");
        Integer key = input.nextInt();

        Encode encode = new Encode(key, stringUserEntered);
        String encodedString = encode.encodeWord(key, stringUserEntered);
        System.out.println("the encoded message is; "+encodedString);

        ///DECODE THE TOP SECRET MESSAGE
        //key
        System.out.println("enter THE number as key");
        Integer decodeKey = input.nextInt();

        Decode decode = new Decode(key, encodedString);
        String decodedString = decode.decodeWord(key, stringUserEntered);
        System.out.println("the decoded string is: " + decodedString);


    }
}