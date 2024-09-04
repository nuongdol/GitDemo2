package B;

public class StringBufferTest {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello ");
//        sb.append(" Java");
//        System.out.println(sb);
        System.out.println(sb.insert(6, "Java"));
    }
}
