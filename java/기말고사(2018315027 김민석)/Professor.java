import MyInterface.CanSpeak;
/**
 * Write a description of class Professor here.
 *
 * @author (2018315027 김민석)
 * @version (2019/06/19)
 */
public class Professor extends Employee implements CanSpeak
{
    public Professor(String name, int salary, int officeHours){
        this.name = name;
        this.salary= salary;
        this.hoursWorked = officeHours;
    }
    public Double pay(){
        return salary * hoursWorked + bonus();
    }
    public void say(){
        System.out.println("<교수 : " + toString() + ", " + (pay()).floatValue() + ">");
    }
    private double bonus(){
        return hoursWorked * 200;
    }
}
