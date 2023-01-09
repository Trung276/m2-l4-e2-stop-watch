import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Nhap 1 de bat dau thuc hien");
            num = sc.nextInt();
        } while (num != 1);
        StopWatch stopWatch = new StopWatch();
        System.out.println("Bat dau thuc hien sap xep 100.000 so ngau nhien");
        stopWatch.start();
        selectionSort();
        stopWatch.stop();
        System.out.println("\n" + "Thoi gian thuc thi chuong trinh: " + stopWatch.toString());
    }
    public static void selectionSort() {
        int [] array = new int[100000];
        int i = 1;
        while (i <= 100000) {
            array[i - 1] =  (int) (Math.random() * 100000);
            i++;
        }
        for(int j = 0; j < array.length - 1; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if(array[j] > array[k]) {
                    int temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.println("Ket qua sap xep nhu sau");
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

    }
}
