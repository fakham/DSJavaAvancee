/**
 * @author : Mohammed FAKHAM
 * @date : 4 January 2019
 */

package partie1;

import java.util.*;

public class ManipulerLinkedList {

    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<>();

        l_list.add("One");
        l_list.add("Two");
        l_list.add("Three");
        l_list.add("Four");
        l_list.add("Five");

        Iterator<String> iterator = l_list.listIterator(2);

        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("order inverser");

        Iterator<String> inverse = l_list.listIterator(l_list.size());

        while (((ListIterator<String>) inverse).hasPrevious())
            System.out.println(((ListIterator<String>) inverse).previous());

        l_list.add(3, "Number");

        l_list.addFirst("First number");
        l_list.addLast("Last number");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        l_list.addAll(2, arrayList);

        System.out.println(l_list.getFirst());
        System.out.println(l_list.getLast());

        String temp = l_list.get(2);
        l_list.set(2, l_list.get(5));
        l_list.set(5, temp);

        Collections.shuffle(l_list);

        System.out.println(l_list.getLast());

        LinkedList<String> l2 = new LinkedList<>();
        l2.push("Element 1");
        l2.push("One");
        l2.push("Five");
        l2.push("Two");
        l2.push("Four");

        System.out.println(comparer(l_list, l2));

    }

    public static <T> List<Integer> comparer(List<T> l1, List<T> l2) {
        List<Integer> list = new LinkedList<>();

        Iterator<T> iteratorL1 = l1.iterator();
        Iterator<T> iteratorL2 = l2.iterator();

        while (iteratorL1.hasNext() && iteratorL2.hasNext())
            list.add(iteratorL1.next().equals(iteratorL2.next()) ? 1 : 0);

        return list;
    }

}
