/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/11/4
 * @Time: 21:23
 * @Description:
 */
public class Move {
    public static void main(String[] args) {
        int[] x = new int[] {1,2,3};
        int oldCapacity = x.length;
        // Double size if small; else grow by 50%
        int newCapacity = oldCapacity + ((oldCapacity < 64) ?
                (oldCapacity + 2) :
                (oldCapacity >> 1));
        System.out.println(newCapacity);
    }
}
