package ai0818;

import java.util.Arrays;

public class ArrayTest03 {
    public static void main(String[] args) {
        int ary[] = {10, 20, 30};

        ary = Arrays.copyOf(ary, ary.length + 2);

        System.out.println("추가된 배열의 길이: " + ary.length);
        System.out.print("추가된 배열의 내용: ");

        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }

        System.out.println();

        for (int data : ary) {
            System.out.print(data + " ");
        }
    }
}
