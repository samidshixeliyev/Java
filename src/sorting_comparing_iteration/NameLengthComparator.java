package sorting_comparing_iteration;

import java.util.*;

class NameLengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // Adın uzunluğuna görə sıralayır
    }
}
