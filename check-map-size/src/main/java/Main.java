import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/8/21
 * @Time: 14:26
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, CopyOnWriteArraySet<ShopData>> map = new HashMap<>(100000);
        int j = 0;
        for (int i = 0; i < 30000; i++) {
            int data = (int) (Math.random() * 10);
            int end = Math.min(j + data, j);
            Set<ShopData> shops = new HashSet<>();
            for (; j < end; j++) {
                ShopData shop = new ShopData();
                shop.setId((long) j);
                shop.setValid(true);
                shop.setGpsData(new GpsData(Math.random(), Math.random()));
                shops.add(shop);
            }
            map.put(i, new CopyOnWriteArraySet<>(shops));
        }

    }
}
