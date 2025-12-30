    class Address {
        public String getCityName(){
            return "New York";
        }
    }

    class User{
        private Address address;
        public User(Address address){
            this.address = address;
        }
        public Address getAddress(){
            return address;
        }
    }
    public class nullpointerexceptiondemo {
    public static void main(String[] args) {
    User user = new User(null);
    try {
        String cityName = user.getAddress().getCityName();
        System.out.println("City Name: " + cityName);
    } catch (NullPointerException e) {
        System.out.println("Caught a NullPointerException: " + e.getMessage());
    }
    }
}