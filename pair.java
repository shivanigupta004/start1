public class pair {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            
            for(int j=i+1;j<arr.length;j++){
                int c=arr[j];
                System.out.print("("+current+","+c+")");
            }  System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int arr2[]={1,2,3,4,5,6,7,8,9,10};
        pairs(arr);
        System.out.println();
        pairs(arr2);
        
    }
    
}
