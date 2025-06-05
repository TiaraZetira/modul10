public interface Gadget {

    void hidupkan();

    default void cekBaterai(){
        System.out.println("100%");
    }

    static void info(){
        System.out.println("ini adalah interface Gadget");
    }
    
}
