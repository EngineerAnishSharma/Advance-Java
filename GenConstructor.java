class Test
{
    String value;
    public<E> Test(E value)
    {this.value = value.toString();}

    String display(){
        return value;
    }
}

class GenConstructor{
    public static void main(String[] args) {
        Test obj1 = new Test("123");
        // Test obj2 = new Test(12.56);
        // Test obj3 = new Test("Anish");
        // Test obj4 = new Test(true);
        System.out.println(obj1.display());
        // obj2.display();
        // obj3.display();
        // obj4.display();
    }
}