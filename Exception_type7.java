public class Exception_type7 {
    public static void main(String[] args) {

        // ArrayStoreException
        Object arr[] = new Integer[5];
        arr[0] = "abc";

        System.out.println(arr[0]);
    }
}

