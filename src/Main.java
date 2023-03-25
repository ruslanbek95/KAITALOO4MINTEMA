public class Main {
    public static void main(String[] args) {
        String a = "  I Like Java!!!";
        System.out.println(a.charAt(a.length()-1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("  I Like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.replace("a" , "o"));
        System.out.println(a.substring(9,13).toUpperCase());
        System.out.println(a.trim());
     //   String a = "Ruslan";
        // boolean значения: проверяет значение последний строка 
       // System.out.println(a.endsWith(""));
        //тоже возврашает boolean значение: Проверяет в наличи данной вами строки в начале 
       // System.out.println(a.startsWith());
        // ИНДЕКС МЕНЕН АДАМ АТЫ ТУУРА КЕЛИШ КЕРЕК (dasha - 1, ruslan 2)
    // varargs(new int[]{18,20},"dasha","ruslan");
    }
    //static void varargs(  int[] ages , String ... names ){

       // for (int i = 0; i <names.length ; i++) {
            //System.out.println(names[i]+ " " +ages[i] +  );
            
        }







