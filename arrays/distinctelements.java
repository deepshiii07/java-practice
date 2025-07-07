public class distinctelements {
    public static void main(String[] args) {
        int count = 0;
        int arr[]={1,2,3,4,5};
        @SuppressWarnings("unused")
        boolean iscounted = true;
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    iscounted=false;
                    break;
                }
            }
        if(iscounted=true){
            count++;
        }    
        iscounted=true;
        }
        System.out.println(count);
    }
}
