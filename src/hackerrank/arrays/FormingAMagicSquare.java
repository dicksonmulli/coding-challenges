package hackerrank.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FormingAMagicSquare {
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(){{add(8); add(3); add(4);}};
        List<Integer> list2 = new ArrayList<>(){{add(1); add(5); add(9);}};
        List<Integer> list3 = new ArrayList<>(){{add(6); add(7); add(2);}};
        arrays.add(list1);
        arrays.add(list2);
        arrays.add(list3);
        System.out.println("max " + formingMagicSquare(arrays));
    }

    private static int formingMagicSquare(List<List<Integer>> s) {
        int minCost = 81;
        s.stream().flatMap(Collection::stream).sorted().collect(Collectors.toList());
        return minCost;
    }
}
