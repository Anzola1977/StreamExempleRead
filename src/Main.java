
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\zolaa\\Test\\Test1.txt";
        FileInputStream fis = new FileInputStream(file);

        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
        System.out.println();
    }
}

