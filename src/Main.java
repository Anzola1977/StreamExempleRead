
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\zolaa\\Downloads\\Infobroschuere.pdf";
        FileInputStream fis = new FileInputStream(file);
        int c = 0;
        int i;
        while ((i = fis.read()) != -1) {
            if (c >= '0' && c <= '9') ;
            c++;
        }

        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println(c);
        fis.close();
        copyFileUsingStream("C:\\Users\\zolaa\\Downloads\\Tel-ran - Angebot (government) (31)[142].pdf", "C:\\Users\\zolaa\\Downloads\\Infobroschuere.pdf");
    }
    private static void copyFileUsingStream(String source, String dest) throws IOException {

        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}

