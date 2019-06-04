import java.util.Scanner;

public class timetable
{
    public class elements
    {
        String code;
        String name;
        String ins;
        int pri;
        int slots;
        int dur;
        int time;
    }
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
                elements a[i]= a[i].elements();
                Scanner a[i].code= new Scanner(System.in);
                Scanner a[i].name= new Scanner(System.in);
                Scanner a[i].ins= new Scanner(System.in);
                Scanner a[i].pri= new Scanner(System.in);
                Scanner a[i].slots= new Scanner(System.in);
                Scanner a[i].dur= new Scanner(System.in);
                Scanner a[i].day= new Scanner(System.in);
                Scanner a[i].time= new Scanner(System.in);
                
            }
            //sort a[i] acc to pri
            for(i=0;i<courses,i++)
            {
                if(a[i].dur==2)
                {
                    for(j=daystart;j<dayend;j++)
                    {
                        for(k=daystart;k<=dayend;k++)
                        {
                            if(d[j][k]==NULL)&&d[j+1][k])
                            {
                                d[j][k]=a[i];
                                flag=1;
                                break;
                            }
                        }
                    }
                    if(flag)
                    break;
                    else
                    {
                        for(j=daystart;j<dayend;j++)
                        {
                            for(k=1;k<=7;k++)
                            {
                                if(d[j][k]==NULL)&&d[j+1][k])
                                {
                                    d[j][k]=a[i];
                                    flag=1;
                                    break;
                                }
                            }
                        }
                    }
                    if(flag)
                    break;
                    else
                    if((d[0][]==NULL)&&(d[3][]==NULL))
                    {
                        


                    }
                    else if ((d[1][]==NULL)||(d[2][]==NULL))
                    {

                    }
                    else if((d[4][]==NULL)&&(d[5][]==NULL))
                    {

                    }
                    else if((d[5][]==NULL)&&(d[6][]==NULL))
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





                /*if(dur==2)
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

                }*/
