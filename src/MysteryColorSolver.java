import java.util.*;

interface MysteryColorAnalyzer{
    int numberOfDistinctColors(List<Color> mysteryColors);
    int colorOccurrence(List<Color> mysteryColors, Color color);
}
enum Color{
    RED, GREEN, BLUE
}


public class MysteryColorSolver implements MysteryColorAnalyzer{

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColours) {
        HashSet<Color> hs = new HashSet<>(mysteryColours);
        return hs.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int occurrenceOfColor = 0;
        for (Color item: mysteryColors)
            if(item.equals(color))
                occurrenceOfColor++;
        return occurrenceOfColor;

    }


    public static void main(String[] args) {
        List<Color> list = new ArrayList<>();
        list.add(Color.BLUE);
        list.add(Color.RED);
        list.add(Color.BLUE);
        list.add(Color.GREEN);
        list.add(Color.BLUE);
        MysteryColorSolver analyzer = new MysteryColorSolver();
        System.out.println("No. of Distinct colors are : "+ analyzer.numberOfDistinctColors(list));
        System.out.println("No. of Occurrence for given color : "+ analyzer.colorOccurrence(list, Color.BLUE));
    }
}
