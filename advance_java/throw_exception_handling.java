public class throw_exception_handling {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("message : " + e.getMessage());
        }
    }
}
