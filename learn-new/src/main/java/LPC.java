/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/11/23
 * @Time: 15:45
 * @Description:
 */
public class LPC implements Cloneable{

//    final String data;
    String data;

    public LPC() {
//        this.data="a";
    }

    public LPC(String data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
