package MyJava.main;

import MyJava.service.MenuService;
import MyJava.vo.MenuVO;
import controller.Controller;
import controller.HandlerMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MenuVO> menuList = new ArrayList<>();
        MenuService service = new MenuService();

        service.load(menuList);

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

                if (no == 0) {
                    System.out.println("데이터를 저장하고 프로그램을 종료합니다.");
                    break;
                }

                Controller controller =
                        HandlerMapping.getInstance().createController(no);

                if (controller != null)
                    controller.execute(sc, menuList);
                } else {
                System.out.println("잘못된 메뉴 번호입니다.");
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
