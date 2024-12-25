//IP Address
class regexIP{
    public static void main(String[] args) {
        String s="172.16.3.28";
//255 --> 0-9 10-99 100-199 200-249 250-255 
        String s1="([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])";
        System.out.println(s.matches(s1+"\\."+s1+"\\."+s1+"\\."+s1));
    }
}
