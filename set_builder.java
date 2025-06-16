public class set_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.replace(1, 3, "no");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(0, 'a');
        System.out.println(sb);
        sb.delete(5, 6);
        System.out.println(sb);


        System.out.println(sb.substring(0, 4));
    }
}
