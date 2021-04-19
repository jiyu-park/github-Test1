import java.util.Scanner;

public class CompareLogicalOperator {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        boolean compareAB;
        System.out.println("첫번째 값을 입력:");
        int a =scan.nextInt();
        System.out.println("두번째 값을 입력:");
        int b =scan.nextInt();

        compareAB = a>b;
        System.out.println("a>b"+"\t"+compareAB);
        compareAB = a<b;
        System.out.println("a<b"+"\t"+compareAB);
        compareAB = a==b;
        System.out.println("a==b"+"\t"+compareAB);
        compareAB = a!=b;
        System.out.println("a!=b"+"\t"+compareAB);

        compareAB=(a>0||b++>0);
        System.out.println("a>0 || b++ >0"+"\t"+compareAB);
        System.out.println("a:"+a+"\t"+"b:"+b+"\r");
        compareAB=(a>0&&b++>0);
        System.out.println("a>0 && b++ >0"+"\t"+compareAB);
        System.out.println("a:"+a+"\t"+"b:"+b+"\r");

    }
}
