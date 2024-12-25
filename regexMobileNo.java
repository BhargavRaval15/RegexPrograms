//Mobile No
class regexMobileNo{
    public static void main(String[] args) {
        String s="+086-0146-456789";
//255 --> 0-9 10-99 100-199 200-249 250-255 
        System.out.println(s.matches("\\+[\\d]{1,3}\\-[\\d]{3,4}\\-[\\d]{6}"));
    }
}
