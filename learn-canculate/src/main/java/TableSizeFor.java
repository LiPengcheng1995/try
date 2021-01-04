import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/10
 * @Time: 10:17
 * @Description:
 */
public class TableSizeFor {
    /**
     * 拿到比他大的最小的2^n的数
     *
     * 可以这么理解这个思路：
     * 1. 先把入参c减1，拿到一个比c小的数n，假如他的从左到右第一个1在x位，后面有1有0
     * 2. 第一次，右移一次做或，保证了 x,x-1是1
     * 3. 第二次，右移两次做或，保证了 x,x-1,x-2,x-3 一共四个位是1
     * 4. 第三次，又把1的四个位变成了8个位
     * .....
     * 最后，就保证了x以下都是1了。加一就能满足是2^n。
     *
     * 又有，n=c-1，第一个位1或者是借位借出来的，这种后面都是1，最后n+1肯定等于c。
     * 如果第一个位1不是借位借出来的，最后的n全为1肯定也大于c了，n+1也大于c。
     *
     * 综上，就是这个套路了
     * @param c
     * @return
     */
    private static final int tableSizeFor(int c) {
        int n = c - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : n+1;
    }

    public static void main(String[] args) {
//        for (int i=1;i<10;i++){
//            System.out.println("i="+i+",n="+tableSizeFor(i));
//        }
        tableSizeFor(7);
    }


}
