import java.util.Random;

class Ghost
{
    String[] colorArray = {"white", "yellow", "purple", "red"};

    public String getDiffColor()
    {
        Random random = new Random();
        int ind = random.nextInt(colorArray.length);
        return colorArray[ind];
    }
}



public class GhostColor {
    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.getDiffColor());
    }
}
