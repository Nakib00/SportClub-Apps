
import java.io.File;


public class Main {

    
    public static void main(String[] args) {
        File dir = new File("parson");
        
        dir.mkdir();    //Directory will created
        
        File file1 = new File("D:/University Work/Google Drive/CSE 213/progeamming/ File or directory/parson/student.txt");
        File file2 = new File("D:/University Work/Google Drive/CSE 213/progeamming/ File or directory/parson/teacher.txt");
        
        try{
        file1.createNewFile();
        file2.createNewFile();
        
        System.out.println("File has been creates");
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
}
