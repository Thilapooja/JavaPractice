public class bssortrotatedarray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 8;
        System.out.println(search(arr, target));
    }
    static int search(int []arr, int target){
        int start = 0;
        int end = arr.length -1;
        
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] >= arr[start]){
                if(target >= arr[start] && target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(target <= arr[end] && target > arr[mid]){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
            
        }return -1;
    }

}
