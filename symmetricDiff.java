import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);
        HashSet<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);
        diff1.addAll(diff2);
        System.out.println("Symmetric Difference: " + diff1);
    }

    // helper method to parse "[1,2,3]" into a HashSet<Integer>
    private static HashSet<Integer> parseSet(String input) {
        input = input.replaceAll("\\[|\\]", ""); // remove [ ]
        HashSet<Integer> set = new HashSet<>();
        if (!input.trim().isEmpty()) {
            for (String num : input.split(",")) {
                set.add(Integer.parseInt(num.trim()));
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String set1String = scanner.nextLine();
        String set2String = scanner.nextLine();

        HashSet<Integer> set1 = parseSet(set1String);
        HashSet<Integer> set2 = parseSet(set2String);

        symmetricDifference(set1, set2);
    }
}
