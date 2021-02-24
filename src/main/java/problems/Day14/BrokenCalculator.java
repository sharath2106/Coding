package problems.Day14;

public class BrokenCalculator {
  public static void main(String[] args) {
    System.out.println(brokenCalc(3, 10));
  }

  public static int brokenCalc(int X, int Y) {
    if (X >= Y) return X - Y;

    if (Y % 2 == 0) {
      return 1 + brokenCalc(X, Y / 2);
    }

    return 1 + brokenCalc(X, Y + 1);
  }
  //        public int brokenCalc(int X, int Y) {
  //            int result=0;
  //
  //            while(Y>X){
  //                result++;
  //                if(Y%2==0){
  //                    Y/=2;
  //                }
  //                else{
  //                    Y++;
  //                }
  //            }
  //
  //            return result+(X-Y);
  //        }
  //    }
}
