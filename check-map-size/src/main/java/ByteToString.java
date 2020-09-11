/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/9/10
 * @Time: 17:02
 * @Description:
 */
public class ByteToString {
    public static void main(String[] args) {
        byte[] x = new byte[]{'a','b'};
        String y = String.valueOf(x);
        String z = new String(x);
        System.out.println(y);
        System.out.println(z);
    }
}
