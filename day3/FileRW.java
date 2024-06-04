package day3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FileRW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        ArrayList<Character> fileContent = new ArrayList<>();
        Map<Character, Integer> characterCount = new HashMap<>();

        try {
            // Read the content of the file using FileReader and BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int c;
            while ((c = bufferedReader.read()) != -1) {
                char character = (char) c;
                fileContent.add(character);

                // Populate the HashMap with character counts
                if (characterCount.containsKey(character)) {
                    characterCount.put(character, characterCount.get(character) + 1);
                } else {
                    characterCount.put(character, 1);
                }
            }

            bufferedReader.close();
            fileReader.close();

            // طباعه
            System.out.println("File content (ArrayList): " + fileContent);
            System.out.println("Character count (HashMap): " + characterCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}