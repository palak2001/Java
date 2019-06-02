import java.util.Scanner;

public class timetable
{
    String a[][];
    a= new int[7][7];
    public static void main(String args[])
    {
        Scanner t= new Scanner(System.in);
        while(t--)
        {
            for(i=0;i<7;i++)
            {
                for(j=0;j<7;j++)
                {
                    a[i][j]=NULL;
                }
            }
            Scanner batches= new Scanner(System.in);
            for(i=0;i<batches;i++)
            {
                Scanner nbatch= new Scanner(System.in);
            }
            Scanner faculty= new Scanner(System.in);
            for(i=0;i<faculty;i++)
            {
                Scanner nfaculty= new Scanner(System.in);
            }
            Scanner couses= new Scanner(System.in);
            for(i=0;i<courses;i++)
            {
                Scanner code[i]= new Scanner(System.in);
                Scanner name[i]= new Scanner(System.in);
                Scanner ins[i]= new Scanner(System.in);
                Scanner pri[i]= new Scanner(System.in);
                Scanner slots[i]= new Scanner(System.in);
                Scanner dur[i]= new Scanner(System.in);
                Scanner day[i]= new Scanner(System.in);
                Scanner time[i]= new Scanner(System.in);
                if(dur==2)
                {
                    if((a[0][]==NULL)&&(a[3][]==NULL))
                    {

                    }
                    else if ((a[1][]==NULL)||(a[2][]==NULL))
                    {

                    }
                    else if((a[4][]==NULL)&&(a[5][]==NULL))
                    {

                    }
                    else if((a[5][]==NULL)&&(a[6][]==NULL))
                    {

                    }
                    else
                    {
                        //Saturday
                    }
                }
                else
                {

                }
            }
        }
    }
}