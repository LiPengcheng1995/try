package mokator;

import com.google.openlocationcode.OpenLocationCode;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/9/7
 * @Time: 10:56
 * @Description:
 */
public class OpenAddressCode {

    public static void main(String[] args) {
        OpenLocationCode code = new OpenLocationCode(39.764410,116.566114,6);
        System.out.println(code.getCode());

        OpenLocationCode code1 = new OpenLocationCode(39.764410,116.566114,8);
        System.out.println(code1.getCode());

    }
}
