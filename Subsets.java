import java.util.*;
public class Main
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
     arr[i]=sc.nextInt();
    }
    for(int num=0;num<1<<n;num++)
     {
      ArrayList<Integer>row=new ArrayList<>();
      for(int ind=0;ind<n;ind++)
       {
        if(((num>>ind)&1)==1)
        {
         row.add(arr[ind]);
        }
       }
        System.out.println(row);
     }
   }
}