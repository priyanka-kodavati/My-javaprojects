package praticeprojects;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validation_of_email {

}



class Test
{
	public static boolean isValid(String email)
	{
		String emailRegex = "^[a-z A-Z 0-9_+&*-]+(?:\\."+"[a-z A-Z 0-9_+&*-]+)*@" +"(?:[a-z A-Z 0-9-]+\\.)+[a-z" +"A-Z]{2,7}]$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> address = new ArrayList<>();
			
		address.add("review-123abc@gmail.com");
		address.add("writing.123abc@gmail.com");
			
		for(String i : address){
			if (isValid(i))
				System.out.println(i + " - Yes");
			else
				System.out.println(i + " - No");
		}
	}
}
