import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/3
 * @Time: 11:15
 * @Description:
 */
public class Random {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        for (int i=0;i<10;i++){
            data.add((int) (Math.random()*100));
        }
        System.out.println(data);
    }
}
