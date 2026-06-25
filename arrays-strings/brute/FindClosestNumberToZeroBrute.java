//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
int[] nums = {-4,-2,1,4,8};
int count1=0;
int count2=Integer.MAX_VALUE;
  for (int num : nums) {
    count1=0;
    while (num!=0){
      if (num>0){
        num--;
      }
      else {
        num++;
      }
      count1++;
    }
    if (count1<count2){
      count2=count1;
    }
  }
  System.out.println("Shortest distance to zero is: "+count2);
}
