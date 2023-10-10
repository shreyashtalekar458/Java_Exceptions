public class Exception_type3 {

    public void Msg(){
        String msg = "From the message , says hello !! ";
    }
    public static void main(String[] args) {
        System.out.println("NullPointer exception ");
        Exception_type3 e2 = new Exception_type3();
        e2 = null;
        e2.Msg();
    }
    
}
