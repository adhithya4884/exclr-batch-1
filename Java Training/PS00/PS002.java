public class PS002 {
    public static void main(String[] args) {
        NextMultipleOf100 obj = new NextMultipleOf100();
        int num = 223;
        System.out.println(obj.MultipleOf100(num));
    }
}
class NextMultipleOf100 {
    
    public int MultipleOf100(int num) {
         if (num <= 0)
             return -1;
         return ((num / 100)+1)*100;
    }
}