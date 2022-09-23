public class GenericMethod {
    public <T,U> void genericsMethod(T []arr,U myName)
    {
        for(T item:arr) {
            System.out.println("Items in array are " + item);
        }
        System.out.println("The other datatype member is "+myName);
    }

    public static void main(String[] args) {
        Integer []arr={1,2,3,4,5};
        String myName="Vaibhav";
        GenericMethod obj=new GenericMethod();
        obj.genericsMethod(arr,myName);
    }
}
