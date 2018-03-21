	
public class BinarySearch {
	
	public int searchFirstOccurence(int number, int array[])
	{
		int low=0; 
		
		int high = array.length-1;
		int result= -1;
		while(low<=high)
		{
			int mid= (high+low)/2;
			
		if (number==array[mid])
		{
			result = mid;
			high= mid-1;
			
		}
			
		else if (number>array[mid])
		{
			low=mid+1;
		}
		else
		{
			high = mid-1;
		}

		}
		
		return result;
		
	}
	
	
	public int searchLastOccurence(int number, int array[])
	{
		int low=0; 
		
		int high = array.length-1;
		int result= -1;
		while(low<=high)
		{
			int mid= (high+low)/2;
			
		if (number==array[mid])
		{
			result = mid;
			low= mid+1;
			
		}
			
		else if (number>array[mid])
		{
			low=mid+1;
		}
		else
		{
			high = mid-1;
		}

		}
		
		return result;
		
	}
	
	public int searchAnyOccurence(int number, int array[])
	{
		int low=0; 
		
		int high = array.length-1;
		while(low<=high)
		{
			int mid= (high+low)/2;
			
		if (number==array[mid])
		{
			return mid;
		}
			
		else if (number>array[mid])
		{
			low=mid+1;
		}
		else
		{
			high = mid-1;
		}

		}
		
		return -1;
		
	}

}
