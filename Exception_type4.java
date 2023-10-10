import java.io.FileReader;

public class Exception_type4 {
    public static void main(String[] args) {
        System.out.println("IOException and FileNotFoundException");
         FileReader f = new FileReader("F2.txt");
            System.out.println(f.read());
            f.close();
    }
}
