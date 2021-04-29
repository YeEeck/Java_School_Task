package ClassTask6.Task2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        FirstLevelTitle car = new FirstLevelTitle(1, "汽车", "管理员", new Date());
        FirstLevelTitle test = new FirstLevelTitle(2, "高考", "管理员", new Date());
        List newsTitleList = new ArrayList();
        newsTitleList.add(car);
        newsTitleList.add(test);
        System.out.println("新闻标题数目为：" + newsTitleList.size() + "条");
        print(newsTitleList);
    }

    public static void print(List newsList) {
        for (int i = 0; i < newsList.size(); i++) {
            FirstLevelTitle title = (FirstLevelTitle) newsList.get(i);
            System.out.println(i + 1 + ":" + title.getTitleName());
        }
    }
}
