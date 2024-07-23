package org.scoula.lib.cli.ui;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    // 사용자에게 정수를 입력받을 용도의 메서드.
    public static int getInt(String title) {
        System.out.println(title);
        return Integer.parseInt(scanner.nextLine());
    }

    // 사용자에게 String을 입력받는 용도의 메서드.
    public static String getLine(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = scanner.nextLine();

        return answer.isEmpty() ? defaultValue : answer;
    }

    // 매개변수만 다른 메소드를 만들며 값을 넘겨준다. (메소드 오버로딩)
    public static boolean confirm(String title) {
        return confirm(title, true);
    }

    public static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        // defaultValue는 boolean값, true면 Y, false면 N.
        System.out.printf("%s %s: ", title, yesNo);

        String answer = scanner.nextLine();
        if (answer.isEmpty())
            return defaultValue;
        // answer가 비어있지 않은 경우, answer와 y가 같은지 비교함.
        // 해당 문자는 대,소문자 상관없음.(IgnoreCase)
        return answer.equalsIgnoreCase("y");
    }
}