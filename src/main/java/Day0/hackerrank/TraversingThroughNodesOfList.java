package Day0.hackerrank;

public class TraversingThroughNodesOfList {

  /* Traversing through the nodes of the list */

  public static void main(String[] args) {

    TraversingThroughNodesOfList secondProgram = new TraversingThroughNodesOfList();
    int[] arr = {2, 3, 3, 2, 5};
    //		[0,1,2,3,4]
    int value = secondProgram.solution(arr);
    System.out.println(value);
  }

  int solution(int[] arr) {
    int length = 0;
    int next = 0;
    if (arr == null) {
      return length;
    }

    while (true) {
      if (length > arr.length - 1) {
        return arr.length - 1;
      }

      next = arr[next];
      length += 1;

      if (next == -1) {
        return length;
      }
    }
  }
}
