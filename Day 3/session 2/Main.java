public class ClassMain {
	public static void main(String[] args) {
		MessagePublisher publisher = new MessagePublisher();

		MessageSubscriberOne ms1 = new MessageSubscriberOne(publisher);
		MessageSubscriberTwo ms2 = new MessageSubscriberTwo(publisher);
		MessageSubscriberThree ms3 = new MessageSubscriberThree(publisher);

		publisher.setState("This is First State");

	
		publisher.detach(ms2);
		publisher.detach(ms3);
		
		publisher.setState("This is Second State");

		publisher.attach(ms3);
		publisher.setState("This is last State");

	}
}
