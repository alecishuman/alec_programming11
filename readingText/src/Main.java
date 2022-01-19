import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> sentences = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null) {
            sentences.add(line);
        }
        br.close();
        System.out.println(findWord(sentences, "computer"));
    }

    public static String findWord(ArrayList<String> lines, String word) {
        String out = "";
        for (int i = 0; i < lines.size(); i++) {
            String[] words = lines.get(i).split(" ");
            if (containWord(words, word)) {
                out += "Sentence " + i + ", Words: ";
                for (int j = 1; j < words.length + 1; j++) {
                    if (words[j-1].equals(word)) {
                        out += j + " ";
                    }
                }
                out += "\n";
            }
        }
        return out;
    }

    public static boolean containWord(String[] words, String word) {
        boolean yes = false;
        for (String w:
             words) {
            if (w.equals(word)) {
                yes = true;
                break;
            }
        }
        return yes;
    }
}
