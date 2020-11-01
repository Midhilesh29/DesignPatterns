public class Main {

    public static void main(String[] args) {
	// write your code here
    	State stateOnline = new Online();
    	State stateOffline = new Offline();
    	Person person1 = new Person.PersonBuilder().setFirstName("Midhilesh")
                .setLastName("Elavazhagan")
                .setPhoneNumber("1111111111")
                .setState(stateOnline)
                .build();
    	Person person2 = new Person.PersonBuilder().setFirstName("Aravind")
                .setLastName("Karthikeyan")
                .setPhoneNumber("1111111222")
                .setState(stateOnline)
                .build();
        Message message = new ImageMessage(28,28,"Problem sheet","JPEG");
        Group TCS2k16 = new TCSGroup(person1);
        person1.addMember(TCS2k16,person2);
        person2.addMessage(TCS2k16,message);
    }
}