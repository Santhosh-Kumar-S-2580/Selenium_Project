import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

public class OTPAUTOMATION {
	public static final String ACCOUNT_SID="ACa2074ea6eb3e637962dfad7fb3a25b19";
	public static final String AUTH_TOKEN="102012b2f0acf2eab9478e005f97e3a7";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//To get the OTP using Twilio API's:
		Twilio.init(AUTH_TOKEN, ACCOUNT_SID);
		String smsBody=getMessage();
		System.out.println(smsBody);
		String OTPNumber=smsBody.replaceAll("[^-?0-9]+", smsBody);
		System.out.println(OTPNumber);
		
	}
	
	public static String getMessage() {
		return getMessages().filter(m->m.getDirection().compareTo(Message.Direction.INBOUND)==1)
				.filter(m->m.getTo().equals("+19784124556")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}
	public static Stream<Message> getMessages() {
		ResourceSet<Message> messages=Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}
}
 