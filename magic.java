public class Magic {
	public static void main(String[] args) {
// This program takes any integer, runs it through a series of calculations, and shows the result. The result is always 3. Magic!

	int myNumber = 99;

  int stepOne = myNumber * myNumber;

  int stepTwo = stepOne + myNumber;

  int stepThree = stepTwo / myNumber;

  int stepFour = stepThree + 17;

  int stepFive = stepFour - myNumber;

  int stepSix = stepFive / 6;

  System.out.println(stepSix);

	}
}
