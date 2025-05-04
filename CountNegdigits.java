public class CountNegdigits {
    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int num : grid){
            if(negative(num)){
                count++;
            }
        }return count;
        }
    public int negative(int num){
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[];j++){
                if(num < 0){
                    
                }
            }
        }
    
    }
}
