package MyJava.controller;

import MyJava.vo.MenuVO;

import java.util.List;
import java.util.Scanner;

public class DeleteController implements Controller{
    @Override
    public void execute(Scanner sc, List<MenuVO> menuList) {
        System.out.print("삭제할 메뉴 번호: ");
        int id = sc.nextInt();

        // 반복문 중 삭제 시 에러 방지를 위해 Iterator 사용 권장
        boolean removed = menuList.removeIf(menu -> menu.getId() == id);

        if (removed) System.out.println("삭제되었습니다.");
        else System.out.println("메뉴를 찾지 못했습니다.");
    }
}
