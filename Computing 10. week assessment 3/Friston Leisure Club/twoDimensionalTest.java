
/**
 * Write a description of class twoDimensionalTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class twoDimensionalTest
{
    public static void main(String[] args){
        int[][] aryNumbers = new int[6][5];
        
        aryNumbers[0][0]=10;
        aryNumbers[0][1]=12;
        aryNumbers[0][2]=43;
        aryNumbers[0][3]=11;
        aryNumbers[0][4]=22;
        aryNumbers[1][0]=20;
        aryNumbers[1][1]=45;
        aryNumbers[1][2]=56;
        aryNumbers[1][3]=1;
        aryNumbers[1][4]=33;
        aryNumbers[2][0]=30;
        aryNumbers[2][1]=67;
        aryNumbers[2][2]=32;
        aryNumbers[2][3]=14;
        aryNumbers[2][4]=44;
        aryNumbers[3][0]=40;
        aryNumbers[3][1]=12;
        aryNumbers[3][2]=87;
        aryNumbers[3][3]=14;
        aryNumbers[3][4]=55;
        aryNumbers[4][0]=50;
        aryNumbers[4][1]=86;
        aryNumbers[4][2]=66;
        aryNumbers[4][3]=13;
        aryNumbers[4][4]=66;
        aryNumbers[5][0]=60;
        aryNumbers[5][1]=53;
        aryNumbers[5][2]=44;
        aryNumbers[5][3]=12;
        aryNumbers[5][4]=11;
        
        int rows = 6;
        int columns = 5;
        int i, j;
        int counter;
        
        for (i=0; i<rows; i++){
            for(j=0;j<columns;j++){
                System.out.println(aryNumbers[i][j]+"");
            }
            System.out.println("");
        }
    }
}
