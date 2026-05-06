package main;

import controller.Controller;
import controller.HandlerMapping;

import java.util.Scanner;

public class EmployeeMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-- 사원 관리 프로그램 --");
            System.out.println("1. 사원 정보 등록");
            System.out.println("2. 사원 정보 삭제");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            int no = sc.nextInt();sc.nextLine();

            Controller controller =
                    HandlerMapping.getInstance().createController(no);

            if (controller != null)
                controller.execute(sc);

            if (no == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
