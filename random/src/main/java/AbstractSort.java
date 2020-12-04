import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/4
 * @Time: 15:42
 * @Description:
 */
public abstract class AbstractSort {

    public static final Integer ARRAY_SIZE = 10;
    public static final boolean BIGGER = true;// 升序

    public List<Integer> data;

    public AbstractSort() {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            data.add((int) (Math.random() * 100));
        }
        this.data = data;
    }

    abstract void sort();
}
