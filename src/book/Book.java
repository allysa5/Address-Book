package book;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;

	public String getName() {

		return name;
	}
	public void setName(String val1){
		name = val1;
	}
	public String getAddress() {

		return address;
	}
	public void setAddress(String val2){
		address = val2;
	}
	public String getCity() {

		return city;
	}
	public void setCity(String val3){
		city = val3;
	}
	public String getState() {

		return state;
	}
	public void setState(String val4){
		state = val4;
	}
	public String getZip() {

		return zip;
	}
	public void setZip(String val5){
		zip = val5;
	}
	public String getPhone() {

		return phone;
	}
	public void setPhone(String val6){
		phone = val6;	
	}
	public String getEmail() {

		return email;
	}
	public void setEmail(String val7){
		email = val7;	
		
	}
	private boolean isEmailValid(String email){  
        boolean isValid = false;  

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = email;  
        //Make the comparison case-insensitive.  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    } 
    
    private boolean isPhoneNumberValid(String phoneNumber){  
        boolean isValid = false;  

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
        CharSequence inputStr = phoneNumber;  
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    }  
}