package ClassTask5.Task3;

public class TitlesTest {
    public static void main(String[] args) {
        Titles titles = new Titles();
        titles.add("1", "title1", "me", "2021");
        titles.add("2", "title2", "me1", "2021");
        System.out.println(titles.getNum());
        titles.printAll();
    }
}
