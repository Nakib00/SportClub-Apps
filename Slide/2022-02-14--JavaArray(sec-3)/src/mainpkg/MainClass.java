package mainpkg;

import java.util.Random;
import users.Student;
//import users.Employee;

public class MainClass {

    /*
    //1-D array
    public static void main(String[] args) {
        //int arr[10];
        //int arr[]={11,22,33};
        //className     handleName;
        int[]           arr0;        //Recommended
        int             arr[];     //May work is some compiler, non recomended
        
        arr = new int[10];
        int i;
        Random r = new Random();
        for(i=0; i<arr.length; i++){
            arr[i] = r.nextInt(100);
        }
        System.out.print("The array elements are: ");
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();           
        
        //System.out.println("arr[10]="+arr[10]); //boundary checking is enforced
        //.....
        System.out.println("good buy");
    }
    */
    /*
    //2-D array
    public static void main(String[] args) {
        int[][] twoDArr;
        Random r = new Random();
        int rows,cols;
        rows = r.nextInt(6)+1;
        cols = r.nextInt(10)+1;
        
        
        twoDArr = new int[rows][];
        int i,j;
        
        for(i=0; i<twoDArr.length; i++){
            //cols = r.nextInt(10)+1;
            twoDArr[i] = new int[cols];
            for(j=0;j<twoDArr[i].length; j++){
                twoDArr[i][j] = r.nextInt(500);
            }
        }
        System.out.println("The 2D array elements are: ");
        for(i=0; i<twoDArr.length; i++){
            for(j=0;j<twoDArr[i].length; j++){
                System.out.print(twoDArr[i][j]+" ");
            }
            System.out.println();
        }
    }  
    */
    
    //3-D array, rubiksCube
    public static void main(String[] args) {
        String[][][] rubiksCube;
        //System.out.println(args.length);
        String[] colors = {"Red", "Green", "Blue", "Yellow", "White", "Orange"};
        Random r = new Random();      
        
        rubiksCube = new String[6][][];    //3D is instanciated
        int i,j,k;
        
        for(i=0; i<rubiksCube.length; i++){ //6 times
            rubiksCube[i] = new String[3][];   //2D handles inside 3D are instanciated
            for(j=0;j<rubiksCube[i].length; j++){
                rubiksCube[i][j] = new String[3];  //ID handles inde all 2Ds are instanciated
                
                for(k=0;k<rubiksCube[i][j].length; k++){
                    rubiksCube[i][j][k] = colors[r.nextInt(6)];
                }
            }
        }
        
        System.out.println("The Shuffeled Rubik's Cube is: ");
        for(i=0; i<rubiksCube.length; i++){ //6 times
            System.out.println("Side-"+i);           
            for(j=0;j<rubiksCube[i].length; j++){               
                for(k=0;k<rubiksCube[i][j].length; k++){
                    System.out.print(rubiksCube[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}

