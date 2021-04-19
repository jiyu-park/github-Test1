import java.util.Scanner;

public class MaxAndMin {
    static int max = -2147483648;
    static int min = 2147483647;

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("입력하는 숫자들의 최대값과 최솟값을 판별");
        System.out.println("입력하는 숫자는 몇개입니까? : ");
        int numbers =scan.nextInt();
        judgeNum(numbers);
    }

    private static void judgeNum(int numbers) {
        for(int i=1; i<=numbers;i++){
            System.out.println(i+"번째 수를 입력: ");
            int number = scan.nextInt();
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }System.out.println("최대값은"+max+"\r"+"최솟값은"+min);}}
