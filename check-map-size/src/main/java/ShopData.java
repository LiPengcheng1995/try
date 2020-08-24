/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/8/21
 * @Time: 14:25
 * @Description:
 */
public class ShopData {
    GpsData gpsData;
    Long id;
    boolean valid;

    public GpsData getGpsData() {
        return gpsData;
    }

    public void setGpsData(GpsData gpsData) {
        this.gpsData = gpsData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
