/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/10
 * @Time: 21:02
 * @Description:
 */
public class TestA {

    int i=0;

    public TestA(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }
}
