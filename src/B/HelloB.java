package B;

public class HelloB {
    public static void main(String[] args) {

        String s1 = "vietJack";
        System.out.println(s1);
        s1.concat("vietJackTeam");
        s1 = s1.concat("vietJackAirline");
        System.out.println(s1);
        String s2 = "VietJack";
        String s3 = "VIETJACK";
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println("Substring: ");
        String h = "hello";
        System.out.println(h.substring(0,3));
        String h1 = " Trang VietJack";
        System.out.println(h1.substring(5));//bat dau tu vi tri 5
        System.out.println(h1.substring(0,5));//lay tu 0-4
    }

}
