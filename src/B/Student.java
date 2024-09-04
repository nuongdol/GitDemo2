package B;

public class Student {
    //Bien hocphi la mot bien private static
    private static double hocphi;
    // FACULTY la mot constant
    public static final String FACULTY = "KhoaIT";
    public static void main(String[] args){
        hocphi = 4000;
        System.out.println(FACULTY + "hoc phi trung binh: " + hocphi);
        int a, b;
        a = 10;
        b =(a == 1) ? 20 : 30;
        System.out.println("Gia tri cua la: " + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Gia tri cua b la: " + b);
        String name = "Doan";
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
