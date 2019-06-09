public class Test
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

        for(int j = 0 ; j < row; j ++){
            int sum = 0;
            int n = 0;
            double average = 0.0;
            for(int i =0;i<raggedArray.length;i++){

                if(j >= raggedArray[i].length){ 
                    continue;

                }
                else{  //길이가 같기않음
                    sum += raggedArray[i][j];
                    n++;

                }  

            }
            average = (double)sum / n ;
            System.out.println((j+1)+"번째 열 : 합 = " + sum + "평균 = " + average);
        }
    }

    public static void main(String[] args){
        int[][]raggedArray = makeArray();
        int longestRowLength = findLongestRowLength(raggedArray);
        calculateArray(raggedArray , longestRowLength);

    }
}
