/**
 *
 *  추상클래스
 * @(2018315027 김민석,2018315055 사토 모에카)
 * @version (2019/06/05)
 */
public abstract class Calc
{
    int a;
    int b;
    abstract void setValue(int a, int b); // 값을 저장
    abstract int calculate();
}
