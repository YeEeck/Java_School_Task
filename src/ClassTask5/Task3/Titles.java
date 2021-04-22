package ClassTask5.Task3;

import java.util.ArrayList;

public class Titles {
    private ArrayList<Title> titles;

    Titles() {
        titles = new ArrayList<>();
    }

    public void add(String id, String title, String creator, String create_time) {
        Title title1 = new Title();
        title1.id = id;
        title1.title = title;
        title1.creator = creator;
        title1.create_time = create_time;
        titles.add(title1);
    }

    public int getNum() {
        return titles.size();
    }

    public void printAll() {
        for (Title title : titles) {
            System.out.println(title.id + "," + title.title + "," + title.creator + "," + title.create_time);
        }
    }
}
