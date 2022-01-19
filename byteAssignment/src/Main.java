import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        toByte("hello");
    }

    public static void toByte(String str) throws IOException{
        FileOutputStream out = new FileOutputStream("out.txt");
        byte[] strBytes = str.getBytes();
        for (byte b: strBytes) {
            out.write(b);
        }
    }
}
