//Email Id
class regexIP{
    public static void main(String[] args) {
        String s="xyz@gmail.com";
//255 --> 0-9 10-99 100-199 200-249 250-255 
        System.out.println(s.matches("\"[\\\\w][\\\\w\\\\d_\\\\-]*@gmail\\\\.com\")"));
    }
}
