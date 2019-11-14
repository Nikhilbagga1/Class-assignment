import java.util.*;
public class t{
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int k;
 int n;
 n=sc.nextInt();
 k=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<arr.length;i++)
 {
     arr[i]=sc.nextInt();

 }
 int s;
 n=n-k+1;
  s=(n*(n+2))/2;
  System.out.print("The Number of subarrays with length "+k+" is = ");
  System.out.println(s);



    }
}