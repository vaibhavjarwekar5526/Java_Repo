import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCart {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.7);
        doubleList.add(3.2);
        doubleList.add(6.8);
        printList(doubleList);
        List<String> stringList = new ArrayList<>();
        stringList.add("Vaibhav");
        stringList.add("Ratnesh");
        stringList.add("Swapnil");
        printList(stringList);
    }


    public static void printList(List<?> listOfAll)//unbounded wildcard
    {
        System.out.println(listOfAll);
    }
}
