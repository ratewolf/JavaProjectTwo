package ai0818;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); // 콘솔로부터 입력받을 수 있는 객체
        int[] numArr = new int[5]; // 5개의 정수 값을 저장할 수 있는 배열 객체
        int hap = 0;

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("* (%d) 정수 입력: ", i + 1);
            numArr[i] = s1.nextInt();
            hap += numArr[i];
        }

        for (int i = 0; i < numArr.length; i++) {
            if (i == 4) {
                System.out.printf("%d = %d", numArr[i], hap);
            }
            else {
                System.out.printf("%d + ", numArr[i]);
            }
        }

        // System.out.println(hap);

        s1.close();
    }
}
