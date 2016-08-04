# MessageApiClient for JAVA

RingRing provides simple and fast API for sending and receiving text messages (SMS), calls and emails all over the world.  We take care of the telecom infrastructure and bring additional services such as Cloud Call Center solutions, Transactional emails, SIP trunking, ...

# How to use

- Contact us at sales@ringring.be, we will create an account for you.
- Once you have access to your account, you will be able to access to interface at https://portal.ringring.be. Here you will see all account information you need to send real messages through the API.
- Lastly, download the code source from Github.

# Example

```Java
public class Example {

    public static void main(String[] args) {
    
        Authentication token = new Authentication("YOUR_ACCESS_KEY");
        MessageClient client = new MessageClient(token);
		
		// Example using simple parameters (usually mandatory parameters)
		try {
			client.createMessage("PHONE_NUMBER", "YOUR_MESSAGE");
		} catch (MessageException e) {
			// ...
		}
		
		// Example using request object (for detailed query) 
		try {
			client.createMessage(new MessageRequest.Builder()
				.withTo(PHONE)
				.withMessage("YOUR_MESSAGE")
				.withFrom("FROM_WHO")
				.withTimeScheduled("DD/MM/YYYY")
				//...
				.build()
			);
		} catch (MessageException e) {
			// ...
		}
		
    }
    
}
```

# Version

Java SE 6 or more

# Installation

It is recommended to use maven to import dependencies.

# Documentation

http://docs.ringring.be 

