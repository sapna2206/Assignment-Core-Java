package com.psl.training.exceptionHandling;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
	private String first_name;
	private String middle_name;
	private String last_name;
	private Date dob;
	private String gender;
	private Date anniversary;
	private String area;
	private String city;
	private long pincode;
	private String state;
	private String country;
	private String mobile_no;
	private String email;
	private String website;
	
	/*public Contact(String first_name,String last_name, String mobile_no, String email) {
		this.setFirst_name(first_name);
		this.last_name = last_name;
		//this.dob = dob;
		this.mobile_no = mobile_no;
		this.email = email;
	}*/

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public void validate(String email,String first_name,String last_name,String mobile_no, Date dob) throws Exception, NullPointerException {       //
		this.setEmail(email);
		this.setFirst_name(first_name);
		this.setLast_name(last_name);
		this.setMobile_no(mobile_no);
		this.setDob(dob);
		/*getEmail();
		getFirst_name();
		getLast_name();
		getMobile_no();
		getDob();*/
		/*String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                			"[a-zA-Z0-9_+&*-]+)*@" + 
                			"(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                			"A-Z]{2,7}$"; 
		Pattern pat = Pattern.compile(emailRegex);
		Matcher match = pat.matcher(email);
		boolean match1 = match.matches();*/
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		//boolean match1 = email.matches(regex);
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(this.mobile_no);
		boolean mobNoMatch = (m.find() && m.group().equals(this.mobile_no));
		if(this.first_name.isEmpty() || this.last_name.isEmpty() || this.dob.equals(null) || this.email.isEmpty())
			throw new InvalidInputException("First_name, Last_name, dob and email are compulsory");
		
		if(this.email.matches(regex) == false)
			throw new InvalidEmailException("Email must be in the correct format,display correct format");
		
		if(!mobNoMatch || this.mobile_no.isEmpty())
			throw new InvalidMobNoException("At least one of either telephone or mobile number must be specified");
	}
}

