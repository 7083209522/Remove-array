# Remove-array

import java.util.Arrays;

public class Main {
public static int[] removeelement(int[] arr ,int index){


      if(arr.length < 0 || arr.length <=index || arr == null)
      {
       return arr;
      }
  
  
 int[] anotherarr = new int[arr.length-1];
  
   int k =0;
   for(int i=0;i<arr.length;i++)
   {
        if(i == index)
        {
        continue;
        }
        anotherarr[k++] = arr[i];
  }
  
 return anotherarr;
}
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    
    int[] arr ={5,4,3,2,1};
    
    int index = 2;
    
     System.out.println("Original Array: "+ Arrays.toString(arr));
 
    arr = removeelement(arr, index);
    System.out.println("after Array: "+ Arrays.toString(arr));
 
  }
}
