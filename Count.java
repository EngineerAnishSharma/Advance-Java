import java.util.ArrayList;

class Student {}
class Rockstar {}
class Hacker {}

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(new Student());
        myList.add(new Student());
        myList.add(new Rockstar());
        myList.add(new Student());
        myList.add(new Hacker());
        count(myList);
    }
    
    public static void count(ArrayList<Object> myList) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;
        
        for (Object obj : myList) {
            if (obj instanceof Student) {
                studentCount++;
            } else if (obj instanceof Rockstar) {
                rockstarCount++;
            } else if (obj instanceof Hacker) {
                hackerCount++;
            }
        }
        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);
    }
}
