package introduction;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		//String input ;//= "13 3 4 5";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String digitWord="";
		switch(n){
		case 1:
			digitWord ="one";
			break;
		case 2:
			digitWord ="two";
			break;
		case 3:
			digitWord ="three";
			break;
		case 4:
			digitWord ="four";
			break;
		case 5:
			digitWord ="five";
			break;
		case 6:
			digitWord ="six";
			break;
		case 7:
			digitWord ="one";
			break;
		case 8:
			digitWord ="one";
			break;
		case 9:
			digitWord ="one";
			break;
		case 0:
			digitWord ="one";
			break;
		default:
			digitWord ="Not a single digit";
			
		}
		System.out.println(n+" in word : "+digitWord);

	}

}
