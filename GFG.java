import java.io.*;
 
class GFG
{
     
// Function to find the frequency of the
// smallest value in the array
	static int frequencyOfSmallest(int n, int arr[])
	{
		int mn = arr[0], freq = 1;
	 
		for (int i = 1; i < n; i++)
		{
	 
			// If current element is smaller
			// than minimum
			if (arr[i] < mn)
			{
				mn = arr[i];
				freq = 1;
			}
			 
		 
			else if (arr[i] == mn)
				freq++;
		}
		return freq;
	}

	static int frequencyOfMax(int n, int arr[])
	{
		int max = arr[0], freq = 1;
	 
		for (int i = 1; i < n; i++)
		{
	 
			// If current element is smaller
			// than minimum
			if (arr[i] > max)
			{
				max = arr[i];
				freq = 1;
			}
			 
		 
			else if (arr[i] == max)
				freq++;
		}
		return freq;
	}



 
    // Driver Code
    public static void main (String[] args)
    {
        int N = 5;
        int arr[] = { 3, 2, 3, 4, 4 };
		
		int min = frequencyOfSmallest(N, arr);
		int max = frequencyOfMax(N, arr);
		
        System.out.println (min+" "+max);
    }
}