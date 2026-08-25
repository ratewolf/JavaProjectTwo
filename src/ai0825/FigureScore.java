package ai0825;

import java.util.Scanner;

public class FigureScore {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg;

        System.out.println("김연아 선수 경기 끝났습니다~~ 짝짝짝");
        System.out.println("심사위원분들은 최대 10점까지 주실 수 있습니다.");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(i + "번째 심사위원 평가 점수==>");
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        avg = (double) sum / scores.length;

        System.out.println("[심사위원 입력점수]");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("심사위원 %d: %d점   ", i+1, scores[i]);
        }
        System.out.println();
        System.out.println("합계 점수: " + sum);
        System.out.printf("평균 점수 : %.2f", avg);

        scanner.close();
    }
}
