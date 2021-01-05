package problems.Day0.oops;

// Subclass
class Derived extends Base {

  // Static is removed here (Causes Compiler Error)
  public static void display(int a) {
    System.out.println("Non-static method from Derived");
  }

  // Static is added here (Causes Compiler Error)
  public void print() {
    System.out.println("Static method from Derived");
  }
}
