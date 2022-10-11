import java.util.*;
import java.io.*;
class Main 
{ 

    static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {20, 20, 30, 40, 40, 40}, n = 6;

       printFreq(arr, n);

    } 

}
