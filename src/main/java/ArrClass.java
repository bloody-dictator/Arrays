/**
 * Created by IntelliJ IDEA.<br>
 * User: Alexey<br>
 * Date: 10.04.2018<br>
 * Time: 21:26<br>
 * todo javadoc
 */
public class ArrClass {

    public static void main(String[] args) {
        int intArr[] = new int[20];
        int y = getMaxNegative(getArr(intArr));
        int x = getMinPositive(getArr(intArr));
        int swap = intArr[y];
        intArr[y] = intArr[x];
        intArr[x] = swap;
        


      }

      public static int[] getArr(int[] intArr) {

          for (int i=0; i<intArr.length; i++){
              intArr[i] = (int)((Math.random()*20)-10);
              //System.out.println(intArr[i]);
          }
          return intArr;

    }

       public static int getMaxNegative (int[] intArr) {
        int indexA = 0;
        int i = 0;
        while (i<intArr.length) {
            if (intArr[i]<0 && i == 0){
                i = indexA;
            } else if(intArr[i]<0 && intArr[i]>intArr[indexA]){
                indexA = i;
            }
            i++;
        }
        return indexA;

       }

       public static int getMinPositive (int [] intArr) {
        int indexB = 0;
        int j = 0;
        while (j<intArr.length) {
            if (intArr[j]>=0 && j==0){
                j = indexB;
            } else if (intArr[j]>0 && intArr[j]<intArr[indexB]){
                indexB = j;
            }
            j++;

        }
           return  indexB;
       }
}
