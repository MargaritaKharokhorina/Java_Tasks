public class program {
    static public void main(String[] args) {
        String s = "Cat";
        float e = 2.7f;
        double pi = 3.1415;
        char ch = '[';
        boolean f = true && false;     //false
        boolean g = true ^ false;     //true
        boolean h = true ^ true;     //false
        var a = 123; 
        int i = 123;
        int d = 124;
        d++; 
        int[] arr = new int[10];                
        System.out.println(s);
        System.out.println(s.charAt(1));  //a (обратились к конкретному символу из "Cat")
        System.out.println(e);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(a);
        System.out.println(getType(a));  //Integer
        System.out.println(Integer.MAX_VALUE); //2147483647 (класс-обертка для типа int, чтобы получить больший функционал)
        System.out.println(d); //125; или записать System.out.println(++d), т.е. без верхнего d++;
        System.out.println(arr[3]);
    }
    static String getType (Object o) {
        return o.getClass().getSimpleName(); //Integer
    }
}