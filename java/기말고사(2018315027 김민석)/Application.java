import MyInterface.CanSpeak;
/**
 * Write a description of class ma here.
 *
 * @author (2018315027 김민석)
 * @version (2019/06/19)
 */
public class Application
{
    public static void main(String[] args){
        Employee list[] = {new Professor("홍길동",20,16), 
                           new Professor("이순신",18,10),
                           new Professor("강감찬",31,5),
                           new Staff("김유신",50),
                           new Staff("유관순",27)}; // 배열 생성
        double totalPay = 0.0; 
        for(Employee employee : list){
            ((CanSpeak)employee).say();
            totalPay +=employee.pay();
            
        }
        System.out.println("급여총합 = "+totalPay);
    }
}
