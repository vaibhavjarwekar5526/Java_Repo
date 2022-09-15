public class PrintAPattern {
    public static void main(String[] args) {
        String[] alphabetArr = {"A", "B", "C", "D", "E"};

        String res = "";

        for(String str: alphabetArr){
            res += str;
            System.out.println(res);
        }
    }
}
