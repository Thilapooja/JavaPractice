public class MinInArray {
    /*public static void main(String[] args) {
        int[] arr={30,38,49,79,80};
        System.out.println(min(arr));
    }
    static int min(int []arr){
       int ans=arr[0];
       for(int i=1;i<arr.length;i++){
        if(arr[i]<ans){
            ans=arr[i];
        }
       } return ans;
    }*/
    public static  void main(String[] args) {
        int [][]matrix={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target=13;
        System.out.println(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;i<matrix[i].length;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }return false;
    }
}
