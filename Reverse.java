import java.util.*;
import java.lang.*;
public class Reverse {
	 public static int reverse(int x) {
	        long sum=0;
	        while(x!=0){
	            sum=sum*10+x%10;
	            x=x/10;
	        }
	        if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE){
	            return 0;
	        }
	        else{
	        return (int)sum;
	        }
	    }
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int res=reverse(num);
		 System.out.println(res);
	 }
}
