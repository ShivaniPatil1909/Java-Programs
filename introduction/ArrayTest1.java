package introduction;

public class ArrayTest1 {
	public static void main(String[] args) {
		int nums[]={1,4,7,10,13,16,19};
		int i;
		for(i=0; i<3; i++)
			System.out.println("nums["+i+"]="+nums[i]);
		System.out.println("using length property to access array elements");
		
		System.out.println("size of nums is "+nums.length);
		for(i=0; i<nums.length; i++)
			System.out.println("nums["+i+"]="+nums[i]);
		
		System.out.println("nums[8]="+nums[8]);
	}
}
