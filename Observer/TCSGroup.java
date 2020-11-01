public class TCSGroup implements Group{
	private Member Admin;
	private ArrayList<Member> members;
	private ArrayList<Message> messages;
	public TCSGroup(Member Admin){
		this.Admin = Admin;
	}
	public subscribe(Member member){
		this.members.add(member);
	}
	public unsubscribe(Member member){
		for (int i = 0; i < this.members.size(); i++){
			if(this.members.get(i).getPhoneNumber()==member.getPhoneNumber()){
				this.members.remove(i);
				break;
			}
		}
	}
	public notify(Message message){
		for (int i = 0; i < this.members.size(); i++){
			this.members.get(i).update(message);
		}
	}
}