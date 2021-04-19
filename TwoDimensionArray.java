public class TwoDimensionArray {

    public static void main(String[]args){
        int[][]timesTable =new int[8][9];
        int i,j;

        for(i=2;i<=9;i++){
            for(j=1;j<=9;j++){
                timesTable[i-2][j-1]=i*j;

            }
        }
        for(i=2;i<=9;i++){
            for(j=1;j<=9;j++){
                System.out.println(i+"*"+j+"*"+timesTable[i-2][j-1]);
                if(j==9){
                    System.out.println("\r");
                }
            }
        }
    }
}
