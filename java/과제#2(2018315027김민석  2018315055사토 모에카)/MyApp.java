import java.util.Scanner;
/** 문제 11
 *  a,b(정수)를 입력해 4칙연산을 하는 프로그램 .
 *
 * @author (2018315027 김민석,2018315055 사토 모에카)
 * @version (2019/06/05)
 */
public class MyApp
{
    public static void main(String[] args){
        System.out.print("두 정수와 연산자를 입력하시오>>");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String c = scan.next();

        if (c.equals("+")){
            Calc add = new Add(); //업케스팅
            add.setValue(a,b);  // 동적바인딩
            int sum = add.calculate();
            System.out.println(sum);
        }
        else if(c.equals("-")){
            Calc sub = new Sub();  //업케스팅
            sub.setValue(a,b);  // 동적바인딩
            int subtract = sub.calculate();
            System.out.println(subtract);
        }
        else if (c.equals("*")){
            Calc mul = new Mul(); // 업케스팅
            mul.setValue(a,b);  // 동적바인딩
            int multiply = mul.calculate();
            System.out.println(multiply);
        }
        else if (c.equals("/")){
            Calc div = new Div(); //업케스팅
            div.setValue(a,b);  // 동적바인딩
            int division = div.calculate();
            System.out.println(division);
            
        }
    }
}
