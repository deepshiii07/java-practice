public class ifsorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={1,2,3,5,4,};
        boolean issorted=true;
        boolean issorted2=true;
        for(int i =1;i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                issorted=false;
                break;
            }
        }
        for(int i =1;i<arr2.length; i++){
            if(arr2[i]<arr2[i-1]){
                issorted2=false;
                break;
            }
        }
        System.out.println("1st Array = "+ issorted);
        System.out.println("2nd Array = "+ issorted2);
    }
}