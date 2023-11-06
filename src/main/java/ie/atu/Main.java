package ie.atu;

public class Main
{
    public static void Main(String[] args) {
        int[] anArray;
        anArray = new int[10];

        anArray = new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};


        for (int value = 0; value < 10; value++) {
            System.out.println("Element at index " + value + ": " + anArray[value]);
        }
    }
}