import java.util.Scanner;
class MatrixMul
{
    public static void main(String args[])
    {
        int i,j,k;
        int Arr1[][]=new int[3][3];
        int Arr2[][]=new int[3][3];
        int Mul[][]=new int[3][3];
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter array-1 elements");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                Arr1[i][j]=sc1.nextInt();
            }
        }
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter array-2 elements");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                Arr2[i][j]=sc2.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    Mul[i][j]=Mul[i][j]+(Arr1[i][k]*Arr2[k][j]);
                }
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(Mul[i][j]+"\t");
            }
                System.out.println(" ");
        }
    }
}