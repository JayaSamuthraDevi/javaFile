public class split {
    
    public static void main(String args[])
    {
       
     String str = "Geeks.for.Geeks";
        String[] arrOfStr = str.split("[.]");   // str.split("."); will give no output...
  
        for (String as : arrOfStr)
            System.out.println(as);
            //----------------------------
String name="codemithra"; 
   char ch=name.charAt(4);
   System.out.println(ch);
//----------------------------------------------------
   String string = "word1, word2 word3@word4?word5.word6";
        String[] arrOfString = string.split("[, ?.@]+");
  
        for (String aq : arrOfString)
            System.out.println(aq);
    }
}