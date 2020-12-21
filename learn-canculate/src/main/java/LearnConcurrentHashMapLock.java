import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/18
 * @Time: 17:15
 * @Description:
 */
public class LearnConcurrentHashMapLock {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> x = new ConcurrentHashMap<>();
        x.put("a","b");
        x.computeIfAbsent("c",k->x.put(k,"d"));
    }

}
