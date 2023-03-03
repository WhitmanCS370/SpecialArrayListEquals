import java.util.ArrayList;

public class S {
    /**
     *  @return true if a1 is a permutation of a2 (same elements, but not same order)
     */
    public static boolean specialArrayListEquals(ArrayList a1, ArrayList a2) {
        a2 = new ArrayList(a2); // clone a2
        if (a1.size() == a2.size()) {
            for (Object o : a1) {
                if (a2.contains(o)) {
                    a2.remove(o);
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
