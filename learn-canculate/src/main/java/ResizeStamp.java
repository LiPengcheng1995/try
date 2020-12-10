/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/10
 * @Time: 16:33
 * @Description:
 */
public class ResizeStamp {
    private static int RESIZE_STAMP_BITS = 16;

    static final int resizeStamp(int n) {
        return Integer.numberOfLeadingZeros(n) | (1 << (RESIZE_STAMP_BITS - 1));
    }

    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            System.out.println("i="+i+",numberOfLeadingZeros="+Integer.numberOfLeadingZeros(i));
            System.out.println("i="+i+",1 << (RESIZE_STAMP_BITS - 1)="+(1 << (RESIZE_STAMP_BITS - 1)));
            System.out.println("i="+i+",n="+resizeStamp(i));
        }
    }
}
