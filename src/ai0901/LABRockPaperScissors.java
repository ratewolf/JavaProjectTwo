package ai0901;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LABRockPaperScissors {
    public static void main(String[] args) {
        String comA, comB;
        String[] resultArr = new String[10000]; // A, B, Draw
        String[] choices = {"가위", "바위", "보"};
        int aWinFreq, bWinFreq, drawFreq; // A가 이긴 횟수, B가 이긴 횟수, 비긴 횟수

        for (int i = 0; i < resultArr.length; i++) {
            Random random = new Random();
            comA = choices[random.nextInt(choices.length)];
            comB = choices[random.nextInt(choices.length)];

            if (comA.equals(comB)) {
                resultArr[i] = "Draw";
            }
            else if (comA.equals("가위")) {
                if (comB.equals("바위")) {
                    resultArr[i] = "B";
                }
                else {
                    resultArr[i] = "A";
                }
            }
            else if (comA.equals("바위")) {
                if (comB.equals("보")) {
                    resultArr[i] = "B";
                }
                else {
                    resultArr[i] = "A";
                }
            }
            else if (comA.equals("보")) {
                if (comB.equals("가위")) {
                    resultArr[i] = "B";
                }
                else {
                    resultArr[i] = "A";
                }
            }
        }

        aWinFreq = Collections.frequency(Arrays.asList(resultArr), "A");
        bWinFreq = Collections.frequency(Arrays.asList(resultArr), "B");
        drawFreq = Collections.frequency(Arrays.asList(resultArr), "Draw");

        System.out.println("컴퓨터 A가 승리한 횟수: " + aWinFreq + "번");
        System.out.println("컴퓨터 B가 승리한 횟수: " + bWinFreq + "번");
        System.out.println("컴퓨터 A와 B가 비긴 횟수: " + drawFreq + "번");
    }
}
