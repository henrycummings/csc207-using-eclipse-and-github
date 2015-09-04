import java.util.Scanner;

public class ISBNchecker {
	static int x, y, q;
	static int n = -1;
	
	static int intbuild (String num)
	{

	if (n == 8)
		return q;
		
		else {
		n = n+1;
		x = Character.getNumericValue(num.charAt(n));
		y = x * (n + 1);
		
		q = y + intbuild(num);
	
		}	
	return q;
	}

	
	/**
	 * @param args 
	 */
	public static void main (String[] args) {
		
		System.out.println("Enter ISBN ");
		
		Scanner in = new Scanner(System.in);
		
		String ISBN = in.nextLine();
		
		in.close();
		
		System.out.println("You entered " +ISBN);
	
		//ISBN = response;
		
		int ISBNnum = intbuild (ISBN);
	
		System.out.println("ISBN = "+ISBNnum);
		
		int z = ISBNnum % 11;
		System.out.println("z = "+z);
		if (Character.getNumericValue(ISBN.charAt(9)) == z)
		System.out.println("Truuuuuuuuu");
		
		else {
				System.out.println("False :(");
			}
		
		
			
		
		// TODO Auto-generated method stub

	}

}

/* Terminal Output
 * 
 * Enter "ISBN
  0205080057
  You entered 0205080057
  ISBN = 117
  z = 7
  Truuuuuuuuu
  
  Enter ISBN 
  0136091812
  You entered 0136091812
  ISBN = 169
  z = 4
  False :(

  Enter ISBN 
  123456789X
  You entered 123456789X
  ISBN = 285
  z = 10
  False :(

Soooo we weren't sure what to do about x; we tried the char conversion but 
they still didn't match
  
*/
