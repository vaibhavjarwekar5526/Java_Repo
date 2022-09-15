public class PrintAPattern {
    public static void main(String[] args) {
        String[] alphabetArr = {"A", "B", "C", "D", "E"};

        String res = "";

        for(int i=0; i<alphabetArr.length; i++){
            res += alphabetArr[i];
            System.out.println(res);
        }
    }
}
