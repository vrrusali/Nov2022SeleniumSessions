package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	/*@Test(expectedExceptions = Exception.class) // Exception super class
	public void loginTest1() {
		System.out.println("login test");
		int i = 9 / 0;
	}*/

	@Test(expectedExceptions = ArithmeticException.class) // expected exception and don't make test fail
	public void loginTest() {
		System.out.println("login test");
		int i = 9 / 0;
	}

	@Test(expectedExceptions = NullPointerException.class) /*1. expected NullPointr exception & it is giving the Arithmetic exception
									 						 2. Whatever exceptions you're getting you have to expect / define the same*/
	public void loginTest2() {
		System.out.println("login test");
		int i = 9 / 0;
	}

}
