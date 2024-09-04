package B;

import org.w3c.dom.ls.LSOutput;

public class ConcatTest {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for(int i = 0; i <10000; i++){
            sb.append("VietJack");
        }
        System.out.println("Thoi gian tieu ton boi StringBuffer: "
        +(System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for(int i  = 0; i < 10000; i++){
            sb2.append("VietJack");
        }
        System.out.println("Thoi gian tieu ton boi StringBuilder: "
        + (System.currentTimeMillis() - startTime + "ms"));
    }
}
