import java.io.File;
import java.io.IOException;

public class Main {

    public class createFile{
    public static void main(String[] args){
        try{
            File myFile = new File("myFile");
            if(myFile.createNewFile()){
                System.out.println("File created successfully"+ myFile.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An Error occurred");
        }
    }
}
}