package chap07;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		SmartPhone smartPhone = new SmartPhone("È«±æµ¿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.phoneRing();
		smartPhone.reveiveMessage();
		smartPhone.turnOff();
	}
}
