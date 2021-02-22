package problems.Day13;

import java.util.LinkedList;

public class MergeTwoSortedLinkedList {

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    list1.add(1, 1);
    list1.add(2, 3);
    list1.add(3, 0);

    LinkedList<Integer> list2 = new LinkedList<>();
    list1.add(1, 10);
    list1.add(2, 9);
    list1.add(3, 1);

    mergeList(list1, list2);
  }

    private static void mergeList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList dummy = new LinkedList<>();
        LinkedList curr = dummy;

        while(list1!=null && list2!=null){

                
        }
    }
}
