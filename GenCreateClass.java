class GenClass<T,T2>{
    T val;
    T2 data;
    GenClass(T val,T2 data)
    {   
        this.data=data;
        this.val = val; 
    }
    void getValue() {
        System.out.println("Value is :"+val);
        System.out.println("Value is :"+data);
        // return data;
    }

}

class GenCreateClass{
    public static void main(String[] args) {
        GenClass<Integer,Integer> obj1 = new GenClass<>(123,111);
        GenClass<Double,Double> obj2 = new GenClass<>(12.56,90.98);
        GenClass<String,String> obj3 = new GenClass<>("Anish","Sharma");
        GenClass<Boolean,Boolean> obj4 = new GenClass<>(true,false);
        obj1.getValue();
        obj2.getValue();
        obj3.getValue();
        obj4.getValue();
    }
}