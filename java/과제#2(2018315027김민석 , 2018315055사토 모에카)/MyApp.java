import java.util.Scanner;
/**
 * a,b(정수)를 입력해 4칙연산을 하는 프로그램 .
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
            Add add = new Add();
            add.setValue(a,b);
            int sum = add.calculate();
            System.out.println(sum);
        }
        else if(c.equals("-")){
            Sub sub = new Sub();
            sub.setValue(a,b);
            int subtract = sub.calculate();
            System.out.println(subtract);
        }
        else if (c.equals("*")){
            Mul mul = new Mul();
            mul.setValue(a,b);
            int multiply = mul.calculate();
            System.out.println(multiply);
        }
        else if (c.equals("/")){
            Div div = new Div();
            div.setValue(a,b);
            int division = div.calculate();
            System.out.println(division);
            
        }
    }
}
