package utils;
public class PinValidator{
	public boolean isValid(String pin1,String pin){
		if(pin.length()==4&&pin.matches(pin)){
			return true;
		}
		else{
			return false;
		}
	}
}
