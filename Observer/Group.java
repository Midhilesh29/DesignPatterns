interface Group{
	public void notify(Message);
	public Message getMessage();
	public void addMessage(Message);
}