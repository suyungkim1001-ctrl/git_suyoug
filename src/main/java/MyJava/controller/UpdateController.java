package MyJava.controller;

import MyJava.vo.MenuVO;

import java.util.List;
import java.util.Scanner;

public class UpdateController implements Controller{
    @Override
    public void execute(Scanner sc, List<MenuVO> menuList) {
        System.out.print("수정할 메뉴 번호: ");
        int id = sc.nextInt();

        for (MenuVO menu : menuList) {
            if (menu.getId() == id) {
                System.out.print("새 가격: ");
                menu.setPrice(sc.nextInt());
                System.out.print("판매 여부(Y/N): ");
                menu.setSold(sc.next().equalsIgnoreCase("Y"));
                System.out.println("수정 완료!");
                return;
            }
        }
        System.out.println("해당 번호의 메뉴가 없습니다.");
    }
}
