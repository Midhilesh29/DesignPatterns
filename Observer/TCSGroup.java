public class TCSGroup implements Group{
	private ArrayList<Member> members;
	private ArrayList<Message> messages;
	public TCSGroup(Member member){
		this.members.add(member);
	}
	public void subscribe(Member member){
		this.members.add(member);
	}
	public void unsubscribe(Member member){
		for (int i = 0; i < this.members.size(); i++){
			if(this.members.get(i).getPhoneNumber()==member.getPhoneNumber()){
				this.members.remove(i);
				break;
			}
		}
	}
	public void notify(Message message){
		for (int i = 0; i < this.members.size(); i++){
			this.members.get(i).update(message);
		}
	}
	public void addMessage(Message message){
		this.messages.add(message);
		this.notify(message);
	}
}