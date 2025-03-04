package banking;
import java.io.Console;
import utils.PinValidator;
public class BankingSystem{
	static final String storedAccountNumber="admin";
	static final String storedPin="12345";	
	
	//LoginProcessor login=new LoginProcessor();
	public static boolean check=LoginProcessor.authenticate(storedAccountNumber,storedPin);

	public static class LoginProcessor{
		static boolean authenticate(String accountNumber, String pin){	
			Console console=System.console();
			String username=console.readLine("Enter Username: ");	
			String pin1=new String(console.readPassword("Enter Pin: "));
			
			PinValidator validator=new PinValidator();
			if(validator.isValid(pin1,pin)==true&&username.equals(accountNumber)){
				return true;
			}
			else{
				return false;
			}
		}

	}
}
