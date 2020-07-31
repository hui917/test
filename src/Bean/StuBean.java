package Bean;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * @Author:liudenghui
 */
public class StuBean {

    private int uuid;

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public StuBean(int uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }
}
