import java.util.Scanner;
class ArrAddition
{
    public static void main(String args[])
    {
        int i,j;
        int Arr1[][]=new int[3][3];
        int Arr2[][]=new int[3][3];
        int Arr3[][]=new int[3][3];
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
                Arr3[i][j]=Arr1[i][j]+Arr2[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(Arr3[i][j]+"\t");
            }
                System.out.println(" ");
        }
    }
}