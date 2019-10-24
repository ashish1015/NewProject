
public class MissingNumberInArray {
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 7, 8 };
		for(int i = 0; i < array.length-1; i++)
			{
				if(array[i+1] != array[i] + 1)
				System.out.println("MISSING ELEMENT " + (array[i] + 1));
			}
		}
}
