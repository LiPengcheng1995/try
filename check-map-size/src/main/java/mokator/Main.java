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
        Double latitude = 39.78955430602357;
        Double longitude = 116.56518448803709;
        OpenLocationCode code = new OpenLocationCode(latitude,longitude,6);
        System.out.println(code.getCode());
    }
}
