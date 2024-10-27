package programming;

public class T2RevereseAStringWithoutInbuilt {

	public String reverseString(String input) {
		char[] chars = input.toCharArray();
		int left = 0, right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}

		return new String(chars);
	}

	public static void main(String[] args) {
		T2RevereseAStringWithoutInbuilt reverser = new T2RevereseAStringWithoutInbuilt();
		String original = "HelloWorld";
		String reversed = reverser.reverseString(original);
		System.out.println("Reversed String: " + reversed);
	}
}
