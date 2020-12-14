import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/11
 * @Time: 14:09
 * @Description:
 */
public class LearnConcurrentHashMapResize {
    public static void main(String[] args) {
        Map<Object,Object> testB = new ConcurrentHashMap<>();
        for (int i=0;i<11;i++){
            testB.put(new TestA(i),new TestA(i));
        }
        testB.put(new TestA(1),new TestA(1));
    }
}
