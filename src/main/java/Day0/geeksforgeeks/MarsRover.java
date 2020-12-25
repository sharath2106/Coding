package Day0.geeksforgeeks;

public class MarsRover {
  public static void main(String[] args) {
    String roverSignal = "SOSSPSSOS";
    int counter = 0;

    for (int i = 0; i < roverSignal.length(); i++) {
      if (i % 3 == 1) {
        if (roverSignal.charAt(i) != 'O') {
          counter++;
        }
      } else {
        if (roverSignal.charAt(i) != 'S') {
          counter++;
        }
      }
    }
    System.out.println(counter);
  }
}
