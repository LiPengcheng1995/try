import java.util.HashMap;
import java.util.Map;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/9/2
 * @Time: 17:51
 * @Description:
 */
public class IterateAndModify {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("3","3");
        for (String x:map.values()){
            map.put("2","2");
        }
    }
}
