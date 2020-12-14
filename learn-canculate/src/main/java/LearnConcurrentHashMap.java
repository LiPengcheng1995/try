import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/10
 * @Time: 20:13
 * @Description:
 */
public class LearnConcurrentHashMap {
    public static void main(String[] args) {
        Map<Object, Object> test = new HashMap<>();
        for (int i = 0; i < 30; i++) {
            test.put(new Object(), new Object());
        }

        Map<Object,Object> testB = new ConcurrentHashMap<>(test);
        testB.put(new TestA(1),new TestA(1));
        testB.put(new TestA(1),new TestA(1));

    }
}
