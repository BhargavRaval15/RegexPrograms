//Number between 0-50
public class regex0to50 {
    public static void main(String[] args) {
        String str = "15";
        // 0-9 10-49
        System.out.println(str.matches("[0-9]|[1-4][0-9]"));
    }
}