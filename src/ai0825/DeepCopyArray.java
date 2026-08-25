package ai0825;

import java.util.Arrays;

public class DeepCopyArray {
    // 깊은 복사
    public static void main(String[] args) {
        String[] foodArr = {"만두", "김치찌개", "삼겹살구이", "돈까스", "치킨"};
        String[] newArr = foodArr.clone();

        foodArr[2] = "한우구이";
        newArr[3] = "옥수수쏨땀";

        System.out.println("원본 배열: " + Arrays.toString(foodArr));
        System.out.println("복제 배열: " + Arrays.toString(newArr));
    }
}
