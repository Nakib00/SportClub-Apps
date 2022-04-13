import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public class ReadFile{
        public static void main(String[] args) throws Exception {
            try{
            File myfile = new File("nakib.txt");
            Scanner readmyfile = new Scanner(myfile);
            while(readmyfile.hasNextLine()){
                String data = readmyfile.nextLine();
                System.out.println(data);
            }
            readmyfile.close();
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
        }

    }
    
}
