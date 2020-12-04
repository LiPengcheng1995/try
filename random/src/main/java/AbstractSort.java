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

    public List<Integer> data;

    public AbstractSort() {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            data.add((int) (Math.random() * 100));
        }
        this.data = data;
    }

    protected void swap(Integer leftIndex, Integer rightIndex) {
        Integer temp = data.get(leftIndex);
        data.set(leftIndex, data.get(rightIndex));
        data.set(rightIndex, temp);
    }

    /**
     * 右边比左边小
     *
     * @param leftIndex
     * @param rightIndex
     * @return
     */
    protected boolean smaller(Integer leftIndex, Integer rightIndex) {
        Integer left = data.get(leftIndex);
        Integer right = data.get(rightIndex);
        return right - left < 0;
    }

    abstract void sort();
}
