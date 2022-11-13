
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\zolaa\\Test\\Test1.txt";
        FileInputStream fis = new FileInputStream(file);
        int c = 0;
        int i;
        while ((i = fis.read()) != -1) {
            if (c >= '0' && c <= '9') ;
            c++;
        }
        System.out.println(c);
        fis.close();
    }
}

