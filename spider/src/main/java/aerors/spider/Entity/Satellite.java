package aerors.spider.Entity;
import java.sql.Timestamp;

public class Satellite {
    private Long id;//识别码
    private String satellite_name;//卫星名
    private Timestamp launch_time;//发射时间
    private Integer height;//离地高度
    private Integer weight;//重量

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSatellite_name() {
        return satellite_name;
    }

    public void setSatellite_name(String satellite_name) {
        this.satellite_name = satellite_name;
    }

    public Timestamp getLaunch_time() {
        return launch_time;
    }

    public void setLaunch_time(Timestamp launch_time) {
        this.launch_time = launch_time;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
