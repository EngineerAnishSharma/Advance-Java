import java.util.*;
class GenRestriction{

    static void display(List<? super Integer> list1){
        for(Object i: list1){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,2,3,4);
        List<Number> l2=Arrays.asList(10.1,11.3,30);
        display(l1);
        display(l2);
    }
}