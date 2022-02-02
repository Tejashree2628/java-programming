import java.util.*;

class targeted
{ 
  public void targetedplot(int arr[][],int rows,int cols)
  {
    int i=0,j=0,imax=0,row=0,col=0,isum=0;
    for(i=1;i<rows-1;i++)
    {
      for(j=1;j<cols-1;j++)
      {
        isum=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j-1]+arr[i][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
        if(isum>imax)
        {
          row=i;
          col=j;
        }
        isum=0;
      }
    }
    System.out.println("purchase"+"row"+row +"col"+col);
  }
}
class problemsolve4
{
  
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter number of rows");
    int rows=obj.nextInt();
    System.out.println("enter number of column");
    int col=obj.nextInt();

    int arr[][]=new int[rows][col];
    System.out.println("enter element");
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<col;j++)
     {
      arr[i][j]=obj.nextInt();
     }
    }
    System.out.println("element are");
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<col;j++)
     {
      System.out.print("\t"+arr[i][j]);
     }
     System.out.println();
    }
    
     targeted tobj=new targeted();
     tobj.targetedplot(arr,rows,col);

  }
}