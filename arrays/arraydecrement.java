//if given array values are 2 3 4 5 6 it makes it 1 2 3 4 5
public class arraydecrement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i =0; i<arr.length; i++){
            arr[i] = arr[i]-1;
            System.out.print(arr[i]+ " ");
        }
        
    }
}
