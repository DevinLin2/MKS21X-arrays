public class ArrayDemo {
  public static void printArray(int[]ary){
    ans = "{";
    for (int i = 0; i < ary.length-1; i ++){
      if (i != ary.length-1){
        ans += ary[i] + ",";
      }else{
        ans += ary[i];
      }
    }
    return ans;
  }
}
