import java.util.Scanner;
class SecondMax
{
    public static void main(String args[])
    {
        int Arr1[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 numbers:");
        for(int i=0;i<5;i++)
           Arr1[i]=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(Arr1[i]>Arr1[j])
                {
                    int t=Arr1[i];
                    Arr1[i]=Arr1[j];
                    Arr1[j]=t;
                }
            }
        }
        System.out.println("the 2nd most max element is:");
        System.out.print(Arr1[5-2]);
    }
}