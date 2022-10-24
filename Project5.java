// date of 1st submision - 06/09/22
// date of 2nd submission - 08/09/22
// date of 3rd submission - 22/09/22


import java.util.Arrays;  
import java.util.Scanner;
import java.io.*;
public class Q5 {
    public static int k = -1000;
    int p33 = -100;
    public static void main(String[] args) throws IOException {
    try{
        System.out.println("Question Number 5....");
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter length of 1st array");
        int n ;
        n = getint();
        while(n == -10){
            n = k;
            
        }
        while(n<0){
            System.out.println("Negaitive Length not possible please re-enter");
            n = newobj.nextInt();
        }
        int[] arr1 = new int[n];  
        arr1 = takearray(arr1, n);
        System.out.println("Enter length of 2nd array");
        int n2 ;
        n2 = getint();
        while(n2 == -10){
            n2 = k;
            
        }
        while(n2<0){
            System.out.println("Negaitive Length not possible please re-enter");
            n2 = newobj.nextInt();
        }
        int[] arr2 = new int[n2];
        arr2 = takearray(arr2,n2);


    }
    catch (Exception e) {// Catch exception if any
        System.err.println("Error please check input values and try again ");
        main(args);
    }



}
    public static int func1(int []arra1,int []arra2) {
        int x=0;
        int L=1;

        Arrays.sort(arra1); 
        for(int i=0;i<arra1.length;i++){
            if(checkif(arra1[i],arra2)==0){
                System.out.println("Solution Found , Answer is ..... " + arra1[i]);
                return x;
            }
            else{
                System.out.println("Smallest Number Not Found");
            }
    }
        


        return x;
    }
    public static int checkif(int i,int []arrayx) {
        int x = 0;
        for(int o=0;o<arrayx.length;o++){
            if(i == arrayx[o]){
                x = 1;
            }

        }
        return x;        
    }


    public static int[] takearray (int[]array,int len)throws IOException{
        try{
            Scanner newobj = new Scanner(System.in);
            for(int i = 0 ; i < len; i++){
                System.out.print("Enter the variable of position " + i + " -");
                array[i] = getint();
                while(array[i]==-10){
                    array[i] = k;
                    
                }
            }
        }
        catch (Exception e) {// Catch exception if any
            System.err.println("Error please check input values and try again ");
            takearray(array, len);
        }
        
        return array;
    }
    public static int getint() throws IOException{
        Scanner newobj = new Scanner(System.in);

        try{
            int b = newobj.nextInt();
            k = b;
            return b;
        }
        catch(Exception e){
            System.err.println("Error Found Try Entering Value Again ");
            getint();

        }
        return -10;
        
        
    }
        
    




}
