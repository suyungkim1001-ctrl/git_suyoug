package MyJava.controller;

import MyJava.vo.MenuVO;

import java.util.List;
import java.util.Scanner;

public interface Controller {
    void execute(Scanner sc, List<MenuVO> menuList);
}
