package ai0825;

import java.util.Random;

public class RandomWiseSaying {
    public static void main(String[] args) {
        String[] wiseSaying = {
                "가장 중요한 건 눈에 보이지 않아.",
                "새는 알에서 나오려고 싸운다.",
                "시간은 마음에서 태어난다.",
                "인생은 공평하지 않다. 그러니 그냥 익숙해져라.",
                "천재란 자신에게 주어진 일을 하는 재능 있는 사람일 뿐이다.",
                "느리게 가는 사람이 가장 멀리 간다.", "비워내야 채울 수 있다.",
                "상황을 가장 잘 활용하는 사람이 가장 좋은 상황을 맞는다.",
                "지위는 남이 주는 것이지만 평안은 내가 만드는 것이다.",
                "오늘 죽을 것처럼 살고 평생을 살 것처럼 공부해라."
        };

        Random random = new Random();
        int number = random.nextInt(wiseSaying.length);

//        for (int i = 0; i < 100; i++) {
//            System.out.print(random.nextInt(10) + " ");
//        }

        System.out.println(wiseSaying[number]);
    }
}
