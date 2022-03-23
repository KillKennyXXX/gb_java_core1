public class lesson1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor(90);
        compareNumbers(5, 8);
    }


    public static void  printThreeWords()   {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void  checkSumSign()   {
        int a =45;
        int b = -55;
        if(a+b>=0){
            System.out.println("\nСумма положительна");
        }
        else {
            System.out.println("\nСумма отрицательна");
        }
    }


    public static void printColor(int value) {
        System.out.println("\n");
        System.out.println(value <= 0 ? "Red" : value <= 100 ? "Yellow": "Green");
    }


    public static void compareNumbers(int a, int b) {
        System.out.println("\n");
        System.out.println(a >= b ? "a >= b" :  "a < b");

    }






}