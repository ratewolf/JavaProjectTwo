package ai0908;

import java.util.Scanner;

public class LABSimpleCalc {
    static int calc(int n1, int n2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                try {
                    result = n1 / n2;
                }
                catch (Exception e) {
                    System.out.println(e.toString() + " : 나눗셈의 분모에 0이 입력되어 오류가 발생했습니다. 결과는 0으로 출력합니다.");
                    result = 0;
                }
                break;
            default:
                System.out.println("잘못된 입력이 들어왔습니다. 결과는 0으로 출력합니다.");
                result = 0;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in); // 정수 입력 받을 때
        Scanner scanner2 = new Scanner(System.in); // 연산자 기호를 문자열로 입력 받을 때

        System.out.println("----- 사칙연산 계산기 -----");

        while (true) {
            System.out.print("정수 1 입력: ");
            int n1 = scanner1.nextInt();
            System.out.print("정수 2 입력: ");
            int n2 = scanner1.nextInt();

            System.out.println("프로그램 종료를 원하면 end를 입력하세요.");
            System.out.print("연산자 입력(+, -, *, /): ");
            String operator = scanner2.next();

//            if (operator.equals("end")) {
//                break;
//            }

            if (operator.toLowerCase().equals("end")) {
                System.out.println("프로그램이 종료됩니다.");
                scanner1.close();
                scanner2.close();
                return;
            }

            int result = calc(n1, n2, operator);

            System.out.printf("계산 결과: %d %s %d = %d\n", n1, operator, n2, result);
        }
    }
}
