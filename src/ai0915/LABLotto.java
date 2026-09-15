package ai0915;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class LABLotto {
    public static int lottoNumDraw(ArrayList<Integer> lottoAry) {
        Random random = new Random();
        int result;

        do {
            result = random.nextInt(45) + 1;
        } while (lottoAry.contains(result));

        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lottoAry = new ArrayList<>();

        System.out.println("======== Lotto 추첨 프로그램 ========");
        for (int i = 0; i < 6; i++) {
            int lottoNum = lottoNumDraw(lottoAry);
            lottoAry.add(lottoNum);
            System.out.println(i + 1 + "번째 숫자는! " + lottoNum + " 입니다.");
        }

        lottoAry.sort(Comparator.naturalOrder());

        System.out.println("======== 이번 주 Lotto 번호 ========");
        System.out.println("당첨 번호: " + lottoAry);
    }
}
