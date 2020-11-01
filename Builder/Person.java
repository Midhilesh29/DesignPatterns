public class Person {
    private String DisplayName;
    private String FirstName;
    private String LastName;
    private int PhoneNumber;
    private String status;
    private Person(PersonBuilder builder){
        this.DisplayName = builder.DisplayName;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.PhoneNumber = builder.PhoneNumber;
        this.status = builder.status;
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
