public class ArrayMethodAssignment {
    public static int[] addNumberToArray(int[] inputArray, int number){
        int[] outputArray = new int[inputArray.length + 1];
        for (int i = 0; i< inputArray.length; i++){
            outputArray[i] = inputArray[i];




        }
        outputArray[outputArray.length - 1] = number;

        return outputArray;
    }
    public static int[] deletelastnumber(int[] inputArray){
        int[] outputArray = new int[inputArray.length - 1];
        for (int i = 0; i< outputArray.length; i++){
            outputArray[i] = inputArray[i];
        }
        return outputArray;
    }

    public static void main(String[] args) {
        int[] integers = new int [10];
        for (int i = 0; i< integers.length; i++){
            integers[i] = 1+i;
            System.out.println(integers[i]);
        }
        System.out.println();
        int[] addNumberToArray = addNumberToArray (integers, 1);
        for (int array : addNumberToArray){
            System.out.println(array);
        }
        System.out.println();
        int[] integers2 = new int[5];
        for (int i = 0; i< integers2.length; i++){
            integers2[i] = (int)(Math.random()*9);
            System.out.println(integers2[i]);
        }
        System.out.println();
        int[] deletelastnumber = deletelastnumber(integers2);
        for (int num : deletelastnumber){
            System.out.println(num);
        }
        System.out.println();

    }




}


