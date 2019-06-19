
/**
 * Abstract class Employee - write a description of the class here
 *
 * @author (2018315027 김민석)
 * @version (2019/06/19)
 */
public abstract class Employee
{
    public int hoursWorked;
    public String name;
    int salary;
    public abstract Double pay();
    public String toString(){
        return name;
    }
}
