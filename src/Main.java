
public class Main {

	public static void main(String[] args) {


 int array[] = {1,3,6,5,5,5,8,9,10,10,10,20,25};
 
 BinarySearch binarySearch = new BinarySearch();
 
 int num = 10;
 
 int firstIndex = binarySearch.searchFirstOccurence(num, array);

 System.out.println(firstIndex+" is the first index of "+num);
 
 int lastIndex = binarySearch.searchLastOccurence(num, array);
 
 System.out.println(lastIndex+" is the last index of "+num);
 
	}

}
