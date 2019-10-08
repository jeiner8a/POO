package clase;

import java.io.InputStreamReader;
import java.io.Reader;

public class Main 
{

	public static void main(String[] args) 
	{
	
//--------------------------------------------------------------------------//		
		/* int contador=0;
		try 
		{
			while(System.in.read()!='\n') 
			{
				contador++;
			}
		}
			catch(Exception e) 
			{
			
			}

		System.err.println();
		System.err.println("tecleo " +contador+" caracteres"); */
		
//--------------------------------------------------------------------------//
	/*	StringBuffer bf= new StringBuffer();
		char c;
		
		try 
		{
			Reader entrada= new InputStreamReader(System.in);
			
			while( (c=(char)entrada.read())!='x') {
				bf.append(c);
			}
		}
			catch(Exception e) {
				System.out.println("Error");
			}
			System.out.println(bf.toString());
	*/
//--------------------------------------------------------------------------//
 
/*char[] buffer= new char[255];
	try 
	{
		Reader entrada= new InputStreamReader(System.in);
		int tamano= entrada.read(buffer); 
	}
		catch(Exception e) 
		{
			
		}
			System.out.println("");
			String str= new String(buffer);
			System.out.println(str);
			*/
//--------------------------------------------------------------------------//

		
	try
	{
	Scanner myObj = new Scanner(System.in); 
		
	} catch(Exception e)
	{
		
	}
    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
		}
	
	}

