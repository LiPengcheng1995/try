package mokator;

import com.google.openlocationcode.OpenLocationCode;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/8/26
 * @Time: 20:35
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        // old 8P2P6R
        // new 8P2P6R
        Double latitude = 30.206192;
        Double longitude = 114.832748;
        OpenLocationCode code = new OpenLocationCode(latitude,longitude,6);
        System.out.println(code.getCode());
    }
}
