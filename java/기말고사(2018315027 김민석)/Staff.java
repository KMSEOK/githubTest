import MyInterface.CanSpeak;
/**
 * Write a description of class Staff here.
 *
 * @author (2018315027 김민석)
 * @version (2019/06/19)
 */
public class Staff extends Employee implements CanSpeak
{
    public Staff(String name, int salary){
        this.name = name;
        this.salary = salary;
        hoursWorked = 80;
    }
    public Double pay(){
        return salary * hoursWorked + (double)80 ; // 급여 계산 
    }
    public void say(){
        System.out.println("<직원 : " + name + ", " + pay() + ">");
    }
}
