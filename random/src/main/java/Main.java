/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/3
 * @Time: 11:15
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        for (int t = 0; t < 5; t++) {
            System.out.println("=======开始一次计算");
            AbstractSort sort = new FastSort();
            System.out.println(sort.data);
            sort.sort();
            System.out.println(sort.data);
            System.out.println(">>>>>>完成一次计算");
        }
    }
}
