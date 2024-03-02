package forLoopDemo;

public class ForDemo {
    public static void main (String[] args){
        int array[] = {3,4,1,5};
         for (int index=0;index<array.length;index++){
         for (int j = index+1; j<array.length;j++){
             if (array[index] > array[j]){
                 int temp = array[index];
                 array [index] = array [j];
                 array[j] = temp;
             }
         }
         }
          for (int i =0;i< array.length;i++){
              System.out.println(array[i]);
          }


      //  for (int count = 100; count <= 0; count++){
          //  System.out.println("count" +count);

        //}
    }
}
