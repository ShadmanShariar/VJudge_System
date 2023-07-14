

import java.util.*;

public class Main {

   public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);
	   
   int n = input.nextInt();
   int [] ar = new int [n];
   int e = 0 , o = 0 ;
   for (int i = 0; i <n; i++) {
	
	   
	   ar[i] = input.nextInt();
	   if (ar[i]%2==0) {
		   e++;
	   }
	   else {
		   o++;
	   }
	   
}

if (e>o) {
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]%2!=0) {
			System.out.println(i+1);
			break;
		}
	}
}
else {
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]%2==0) {
			System.out.println(i+1);
			break;
		}
	}
}
   

 
   

    input.close();
    System.exit(0);
    
 }


   public static int fibon (int n) {
	   
	   if (n<=1) {
		   
		   return n;
	   }
	   int [] array = new int [n+1];
	   array[0] = 0 ; array[1]= 1;
	   for (int i = 2; i <= n; i++) {
		array[i] = array [i-2] + array[i-1];
	}
	   
	return array[n];
	   
   }
   
   
	public static int sumofdigits(int n) 
    {     
    int sum = 0; 
      
    while (n != 0) 
    { 
        sum = sum + n % 10; 
        n = n/10; 
    } 
  
   return sum; 
} 

   public static int reversedigits(int num) 
    { 
    int rev_num = 0; 
    while(num > 0) 
    { 
        rev_num = rev_num * 10 + num % 10; 
        num = num / 10; 
    } 
    return rev_num; 
    } 
	public static int binarysearch(int arr[], int l, int r, int x) 
    { 
		
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return binarysearch(arr, l, mid - 1, x); 
            return binarysearch(arr, mid + 1, r, x); 
        }  
        return -1; 
    }
		
	public static long gcd(long a, long b)
	    {
	        if (a == 0)
	            return b; 
	        return gcd(b % a, a); 
	    }
	
	  public static long lcm (long a, long b)
	    {
	        return (a / gcd(a, b)) * b;
	    }
	    
	  public static void rangeofprimenumber(int a, int b) 
	    {  
	    	int i, j, flag;
	    	for (i = a; i <= b; i++) {
	            if (i == 1 || i == 0)
	                continue;
	            flag = 1;
	            for (j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    flag = 0;
	                    break;
	                }
	            }
	            if (flag == 1)
	                System.out.println(i);
	        }
	    } 
	  
	   public static boolean isprime(int n)
	    {
	        if (n <= 1)
	            return false;
	        else if (n == 2)
	            return true;
	        else if (n % 2 == 0)
	            return false;
	        for (int i = 3; i <= Math.sqrt(n); i += 2) 
	        {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
	    
	   public static int factorial(int n) 
	    { 
	      return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 
	    } 
	   
	   public static int[] reversearrayinrange(int arr[],int start, int end)
             {
               int temp;
     
               while (start < end)
              {
                temp = arr[start]; 
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
              } 
               return arr;
       } 
 
}