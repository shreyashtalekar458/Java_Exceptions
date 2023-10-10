public class Exception_type1 {

    public void ArithmeticExcetion_ex(int a){
        System.out.println("Arithmetic Exception"+a/0);
        
    }

    public static void main(String[] args) {
        Exception_type1 e1 = new Exception_type1();
        e1.ArithmeticExcetion_ex(25);
    }
    
}
