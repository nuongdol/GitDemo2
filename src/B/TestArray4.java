package B;

public class TestArray4 {
    public static void main(String[] args){
        int[] arr = {4,4,5};
        Class c = arr.getClass();
        String name = c.getName();
        System.out.println(name);
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom,2, copyTo,0, 7);
        System.out.println(new String(copyTo));
        char[] copyTo1 = new char[11];
        System.arraycopy(copyFrom, 2, copyTo1, 0, 11);
        System.out.println(new String(copyTo1));
        char[] copyTo2 = new char[copyFrom.length];
        System.arraycopy(copyFrom, 0, copyTo2, 0, copyFrom.length);
        System.out.println(copyTo2);
    }
}
