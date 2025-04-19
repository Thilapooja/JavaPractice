public class LinearSearch {
    public static void main(String[] args) {
        int[] nums ={12,34,56,75,89,56};
        int target=56;
        int ans=LinearSearch1(nums,target);
        System.out.println(ans);
    }
    static int LinearSearch1(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    
}
