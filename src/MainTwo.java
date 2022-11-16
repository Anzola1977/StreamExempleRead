import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTwo {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\zolaa\\Test\\Test1.txt";
        FileOutputStream fos = new FileOutputStream("C:\\Users\\zolaa\\Test\\Test1.txt");
        fos.write("Hello world!".getBytes());
        FileInputStream fis = new FileInputStream(file);
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
        fos.close();
        System.out.println();
    }
}


