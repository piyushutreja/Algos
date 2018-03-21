
public class Main {

	public static void main(String[] args) {
System.out.println("Hi i am " );

 int array[] = {1,3,10,10,5,5,5,8,9,15};
 
 BinarySearch binarySearch = new BinarySearch();
 
 int num = 10;
 
 int index = binarySearch.searchAnyOccurence(num, array);

 System.out.println(index+" is the index of "+num);
	}

}
