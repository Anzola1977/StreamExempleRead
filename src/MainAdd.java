import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainAdd {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("C:\\Users\\zolaa\\OneDrive\\Документы\\Number1.txt"));
        Scanner in2 = new Scanner(new FileInputStream("C:\\Users\\zolaa\\OneDrive\\Документы\\Number2.txt"));
        System.out.println(in.nextInt() + in2.nextInt());
    }
}
