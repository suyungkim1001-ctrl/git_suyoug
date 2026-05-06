package MyJava.main;

import MyJava.service.StudentService;
import controller.Controller;
import controller.HandlerMapping;

import java.io.*;
import java.util.Scanner;

public class StudentMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            while (true) {
                System.out.println("-- 메뉴 관리 프로그램 --");
                System.out.println("1. 메뉴 등록");
                System.out.println("2. 메뉴 삭제");
                System.out.println("3. 메뉴 수정");
                System.out.println("4. 전체 메뉴 조회");
                System.out.println("0. 프로그램 종료");
                System.out.println("원하시는 메뉴번호를 입력하세요 :");
                int no = sc.nextInt();
                sc.nextLine();

                Controller controller =
                        HandlerMapping.getInstance().createController(no);

                if (controller != null)
                    controller.execute(sc);

                if (no == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
        } finally {
            StudentService.
        }
    }
}
