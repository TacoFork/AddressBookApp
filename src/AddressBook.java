import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
    private String name, address, city, state, zip, phone, email;

    public AddressBook(){
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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public String getZip(){
        return this.zip;
    }

    public void setPhone(String phone){
        boolean valid = this.isPhoneNumberValid(phone);
        if (valid){
            this.phone = phone;
        }
        else{
            System.out.println("Invalid phone number");
        }
    }

    public String getPhone(){
        return this.phone;
    }

    public void setEmail(String email){
        boolean valid = this.isEmailValid(email);
        if (valid){
            this.email = email;
        }
        else{
            System.out.println("Invalid email");
        }
    }

    public String getEmail(){
        return this.email;
    }
}
