
public class WeightException{
    WeightException() throws Exception {
        throw new Exception("Weight limit exceeded");
    }
    public static void main(String[] args) {
        try {
            WeightException we = new WeightException();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
