package org.phone;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("1");
	}
	
	public void phoneMieiNum() {
		System.out.println("2");
	}
	
	public void camera() {
		System.out.println("3");
	}
	
	public void storage() {
		System.out.println("4");
	}
	
	public void osName() {
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		PhoneInfo pi = new PhoneInfo();
		
		pi.phoneName();
		pi.phoneMieiNum();
		pi.camera();
		pi.storage();
		pi.osName();
	}

}
