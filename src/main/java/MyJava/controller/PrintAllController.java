package MyJava.controller;

import MyJava.vo.MenuVO;

import java.util.List;
import java.util.Scanner;

public class PrintAllController implements Controller{
    @Override
    public void execute(Scanner sc, List<MenuVO> menuList) {
        System.out.println("\n--- [전체 메뉴 목록] ---");
        if (menuList.isEmpty()) {
            System.out.println("등록된 메뉴가 없습니다.");
            return;
        }
        for (MenuVO menu : menuList) {
            System.out.println(menu);
        }
    }
}
