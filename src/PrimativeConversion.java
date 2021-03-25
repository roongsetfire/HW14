
public class PrimativeConversion {
	public static void main(String[] args) {
		int myInt = 5;
		float myFloat = myInt; // Widening
		System.out.println("myInt value: " + myInt);
		System.out.println("myFloat value: " + myFloat);
		float newFloat = 5.5f;
		int newInt = (int) newFloat; // Narrowing
		System.out.println("newFloat value: " + newFloat);
		System.out.println("newInt value: " + newInt);
		int otherInt = 130;
		byte myByte = (byte) otherInt; // Overflow
		System.out.println("otherInt value: " + otherInt);
		System.out.println("myByte value: " + myByte);

	}

}
