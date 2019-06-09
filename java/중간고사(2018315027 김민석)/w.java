public class w
{
    public static int[][] makeArray(){
        int[][] raggedArray = {{78,48,78,98},
                               {99,92},
                               {29,64,83},
                               {34,78,92,56}};

        return raggedArray;
    }

    public static int findLongestRowLength(int[][] raggedArray){
        int longestRowLength = raggedArray[0].length;
        int i = 0;
        for( int[] array  : raggedArray){
            longestRowLength = (longestRowLength <= array.length)?(array.length) : (longestRowLength);//(true면)? true:false
            
        }
        return longestRowLength;
    }

    public static void calculateArray(int[][] raggedArray,int row){
        int sum = 0;
        int n = 0;
        for(int j = 0 ; j < row; j ++){
            for(int i =0;i<raggedArray.length;i++){
                if(j >= raggedArray[i].length){
                    continue;
                }
                else{
                    sum += raggedArray[i][j];
                    n++;
                }
                
            }
        }
    }

    public static void main(String[] args){
        int[][]raggedArray = makeArray();
        int longestRowLength = findLongestRowLength(raggedArray);
        calculateArray(raggedArray , longestRowLength);

    }
}
