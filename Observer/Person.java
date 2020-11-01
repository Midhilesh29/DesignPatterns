public class Person implements Member{
    private String DisplayName;
    private String FirstName;
    private String LastName;
    private int PhoneNumber;
    private String status;
    private State state;
    private ArrayList<Group> groups;
    private Person(PersonBuilder builder){
        this.DisplayName = builder.DisplayName;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.PhoneNumber = builder.PhoneNumber;
        this.status = builder.status;
    }
    @Override
    public update(Message message){
        this.state.doAction(message);
    }
    @Override
    public Message getMessage(){
        return this.state.dequeue();
    }
    @Override
    public Message addMessage(Group g1, Message m1){
        g1.addMessage(m1);
    }
    public static class PersonBuilder{
        private String DisplayName;
        private String FirstName;
        private String LastName;
        private int PhoneNumber;
        private String status;
        public Person build(){
            return new.Person(this)
        }
        public PersonBuilder setDisplayName(String dname){
            this.DisplayName = dname;
            return this;
        }
        public PersonBuilder setFirstName(String fname){
            this.FirstName = fname;
            return this;
        }
        public PersonBuilder setLastName(String lname){
            this.LastName = lname;
            return this;
        }
        public PersonBuilder setPhoneNumber(int number){
            this.PhoneNumber = number;
            return this;
        }
        public PersonBuilder setStatus(String status){
            this.status = status;
        }
    }
}