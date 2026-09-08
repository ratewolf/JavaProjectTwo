package ai0908;

import java.util.Scanner;

public class MethodCalculator {
    static int calc(int v1, int v2, String operator) {
        int result = 0;

        switch (operator) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                try {
                    result = v1 / v2;
                }
                catch (Exception e) {
                    System.out.println(e.toString() + " : 나눗셈의 분모에 0이 입력되어 오류가 발생했습니다. 결과는 0으로 출력합니다.");
                    result = 0;
                }
                break;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in); // 정수 입력 받을 때
        Scanner scanner2 = new Scanner(System.in); // 연산자 기호를 문자열로 입력 받을 때

        System.out.println("----- 사칙연산 계산기 -----");
        System.out.print("정수 1 입력: ");
        int v1 = scanner1.nextInt();
        System.out.print("정수 2 입력: ");
        int v2 = scanner1.nextInt();

        System.out.print("연산자 입력(+, -, *, /): ");
        String op = scanner2.next();

        int result = calc(v1, v2, op);

        System.out.printf("계산 결과: %d %s %d = %d\n", v1, op, v2, result);

        scanner1.close();
        scanner2.close();
    }
}
