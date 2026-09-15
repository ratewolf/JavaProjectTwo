package ai0915;

import java.util.Scanner;

public class LABPassword {
    // 비밀번호의 문자 개수는 8개 이상
    // 한글 또는 영문만 사용하고 숫자나 기호는 사용하지 못함.
    static boolean passwordCheck(String pwd) {
        if (pwd.length() < 8) {
            System.out.print("(비밀번호 문자열의 길이가 8개 이상이어야 합니다.) ");
            return false;
        }
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (!Character.isAlphabetic(ch)) {
                System.out.print("(비밀번호에는 한글 또는 영문만 사용 가능합니다.) ");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String pwd = "";

        System.out.println("비밀번호는 8자리 이상이어야 하고, 한글과 영문 이외에는 사용할 수 없습니다.");

        do {
            if (!pwd.isEmpty()) {
                System.out.println("잘못된 비밀번호입니다.");
            }
            System.out.print("새로운 비밀번호를 입력하세요: ");
            pwd = s1.next();
        } while (!passwordCheck(pwd));

        System.out.println("비밀번호가 변경되었습니다.");

        s1.close();
    }
}
