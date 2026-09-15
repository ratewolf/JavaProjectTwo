package ai0915;

public class VariableTest01 {
    static int a = 100;
    int b = 500;

    static void method01() {
        int a = 300;
        int b = 7000;
        VariableTest01 variableTest01 = new VariableTest01();

        System.out.println("지역 변수 a에 저장된 값: " + a);
        System.out.println("전역 변수 a를 method01()에서 사용하고 싶을 때: " + VariableTest01.a);
        System.out.println("non-static 전역 변수(필드) b에 저장된 값: " + variableTest01.b);
    }

    static void method02() {
        a += 20;
        System.out.println("전역 변수(필드) a에 저장된 값: " + a);
    }

    public static void main(String[] args) {
        method01();
        method02();
    }
}
