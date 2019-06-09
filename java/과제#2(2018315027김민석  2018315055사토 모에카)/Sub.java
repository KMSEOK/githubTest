
/**
 * Calc 추상클래스에서 setValue메소드,calculate메소드 오버라이딩
 *
 * @(2018315027 김민석,2018315055 사토 모에카)
 * @version (2019/06/05)
 */
public class Sub extends Calc
{
    void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    int calculate(){
        int sub = this.a - this.b;
        return sub;
    }
}
