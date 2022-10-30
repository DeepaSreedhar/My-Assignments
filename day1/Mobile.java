package w1.day1;

public class Mobile {

	private void makeCall() {
		String mobileModel = "Vivo";
Float mobileWt = 172.34F;
System.out.println("callDeepa");
System.out.println(mobileWt);
	}
	
	private void sendMsg() {
	boolean fullCharged;
	int mobilePrice = 10000;
	System.out.println("MsgDeepa");

	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
	}
	
}
