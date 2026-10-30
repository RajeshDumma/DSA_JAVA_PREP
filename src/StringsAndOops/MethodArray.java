package StringsAndOops;

class ArrEx{

    void printArray(int arr[]) {
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
    }

}

public class MethodArray {
    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5};

        ArrEx obj = new ArrEx();

        System.out.println("Before changing:");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        obj.printArray(arr);

        System.out.println("\nAfter changing:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
