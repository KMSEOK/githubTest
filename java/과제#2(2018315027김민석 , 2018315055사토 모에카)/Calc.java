
/**
 *
 *  추상클래스
 * @(2018315027 김민석,2018315055 사토 모에카)
 * @version (2019/06/05)
 */
public abstract class Calc
{
    private int a;
    private int b;
    public abstract void setValue(int a, int b); // 값을 저장
    public abstract int calculate();
}
