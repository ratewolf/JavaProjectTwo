package ai0825;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        Integer[] numArr = {33, 99, 11, 77, 22, 88, 66, 44, 55};
        Arrays.sort(numArr, Collections.reverseOrder());
        for (int data : numArr) {
            System.out.print(data + "   ");
        }

        System.out.println();

        String[] nameArr = {"김유민", "도형준", "강석현", "유재화", "장영서"};
        // Arrays.sort(nameArr); // 오름차순 정렬
        Arrays.sort(nameArr, Collections.reverseOrder()); // 내림차순 정렬
        for (String name : nameArr) {
            System.out.print(name + "    ");
        }
    }
}
