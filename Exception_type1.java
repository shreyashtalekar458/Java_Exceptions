public class Exception_New {

    public void ArithmeticExcetion_ex(int a){
        System.out.println("Arithmetic Exception"+a/0);
        
    }

    public static void main(String[] args) {
        Exception_New e1 = new Exception_New();
        e1.ArithmeticExcetion_ex(25);
    }
    
}
