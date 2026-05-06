package MyJava.controller;

import MyJava.vo.MenuVO;

import java.util.List;
import java.util.Scanner;

public class AppendController implements Controller {
    @Override
    public void execute(Scanner sc, List<MenuVO> menuList) {
        System.out.print("메뉴 번호: ");
        int id = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("메뉴 이름: ");
        String name = sc.nextLine();

        System.out.print("가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("카테고리: ");
        String category = sc.nextLine();

        menuList.add(new MenuVO(id, name, price, category, true));
        System.out.println("메뉴가 추가되었습니다.");
    }

}
