import java.util.Scanner;

public class abc2D {

    public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Key found at index of ("+i+","+j+").");
                    return true;
                }
            }
        }
        System.out.println("Key not found .");
        return false;
    }
    public static void main(String[]args){
        int arr[][] = new int[3][3];
        int key = 9;
        Scanner sc =  new Scanner(System.in);
        //input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
              System.out.print( arr[i][j] +" ");
            }
            System.out.println();
        }
        search(arr, key);
    }
}
