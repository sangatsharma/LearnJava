class ToStringMethods

{
    public static void main(String[] args) {
        String name="  Sangat   Sharma  ";
        boolean result=name.equals("Sangat Sharma"); //case sensitive
        boolean Result=name.equalsIgnoreCase("sangat sharma"); //case insensitive
        System.out.println(result);
        System.out.println(Result);
        int length=name.length();//return length of string
        System.out.println(length);
        char findchar=name.charAt(3);//find character of index 3
        System.out.println(findchar);
        int index=name.indexOf("n");//find index of character from beginning
        System.out.println(index);
        boolean ifEmpty=name.isEmpty();
        System.out.println(ifEmpty);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String trim=name.trim();//removes space before and after final character in a string
        System.out.println(trim);
        System.out.println(name.replace("a", "z"));//replace all a char with z
        Character a='a';//character /char same
        System.out.println(a);
    }

}