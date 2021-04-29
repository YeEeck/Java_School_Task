package ClassTask6.Task2;

import java.util.Date;

public class FirstLevelTitle {
    private int id;                     //ID
    private String titleName;  //名称
    private String creater;      //创建者
    private Date createTime;  //创建时间

    public FirstLevelTitle(int id, String titleName, String creater, Date createTime) {
        this.id = id;
        this.titleName = titleName;
        this.creater = creater;
        this.createTime = createTime;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

}
