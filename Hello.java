class Hello{

    // Genric
    static <T>void genDisplay(T a){
        System.out.println(a.getClass().getName());
        System.out.println(a);
    }

    public static void main(String[] args) {
        genDisplay(15);
        genDisplay("Anish");
        genDisplay(11.5);
    }
}