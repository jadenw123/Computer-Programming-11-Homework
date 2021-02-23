public class ArrayPractice {
    public static void main(String[] args) {
        int [] array = new int [20];
        int count = 0;
        for (int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random()*6) + 1;
        }
        for (int i = 0; i<array.length;i++){
            if(array[i] == i){
                count ++;
            }
        }
        System.out.println("One's Count:" + count);




        int [] array2 = new int [10];
        int average = 0;
        int add = 0;
        for (int i = 0;i<array2.length;i++){
            array2[i] = (int)(Math.random()*100) + 1;
            add = add + array2[i];
            System.out.println("index:"+i+"value"+array2[i]);
        }
        average = add/10;
        System.out.println("Average all Values:"+average);

        int x = array2[0];
        array2[0] = array2[1];
        array2[1] = x;
        System.out.println(array2[0]);
        System.out.println(array2[1] + "\n");

        int [] array3 = new int[10];
        for (int i = 0;i<array3.length;i++){
            array3[i] = array2[9 - i];
            System.out.println(array3[i]);
        }


    }






    }






