import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *  정수 3개 입력 하고 합을 구하는 프로그램
 *  문자 입력시 예외처리 하고 다시 입력
 * @author (김민석 2018315027)
 * @version (2019/05/13)
 */
public class Exam3{   

    public static void main(String[] aegs){
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 3개 입력 하세요. : ");
        int[] inputData = new int[3];
        int i =0;
        int sum =0;

        while(i< 3){
            System.out.print( i +">>");
            try{
                inputData[i] = scan.nextInt();
            }
            
            catch(InputMismatchException e){
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scan.next();
                continue;
            }
            i++;
        }

        for(int Data : inputData){
            System.out.print(Data + " ");
            sum += Data;
        }
        System.out.println("==>>합은"+ sum);
    }
}
