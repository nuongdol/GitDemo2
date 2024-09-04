package B;

public class FresherJuice {
    enum FresherJuiceSize{SMALL, MEDIUM, LARGE}
    FresherJuiceSize size;
}
 class FreshJuiceTest{
    public static void main(String args[]){
        FresherJuice juice = new FresherJuice();
        juice.size = FresherJuice.FresherJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
    }

}
