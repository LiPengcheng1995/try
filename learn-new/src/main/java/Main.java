/**
 * @author: 李鹏程
 * @date: 2020/11/23
 * @Time: 15:46
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        LPC origin = new LPC("lpc");
        LPC[] clone = new LPC[10000 * 1000];
        Long start = System.currentTimeMillis();
        for (int i=0;i<10000 * 1000;i++){
            clone[i] = (LPC) origin.clone();
        }
        Long x = System.currentTimeMillis();
        System.out.println(x-start);
        for (int i=0;i<10000 * 1000;i++){
            clone[i] = new LPC(origin.data);
        }
        Long y = System.currentTimeMillis();
        System.out.println(y-x);

        for (int i=0;i<10000 * 1000;i++){
            clone[i] = new LPC();
        }
        Long z = System.currentTimeMillis();
        System.out.println(z-y);
    }
}
