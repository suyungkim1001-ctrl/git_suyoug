package MyJava.service;

import MyJava.vo.MenuVO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private final String FILE_PATH = "menu.csv";

    public void load(List<MenuVO> menuList) {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("기존 데이터 파일이 없어 새로 생성합니다.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine(); // 헤더 스킵

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                menuList.add(new MenuVO(
                        Integer.parseInt(d[0].trim()),
                        d[1].trim(),
                        Integer.parseInt(d[2].trim()),
                        d[3].trim(),
                        d[4].trim().equalsIgnoreCase("Y")
                ));
            }
            System.out.println(">>> 데이터 로드 성공 (" + menuList.size() + "개)");
        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }
    }

    public void save(List<MenuVO> menuList) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            pw.println("메뉴번호,메뉴이름,가격,카테고리,판매여부");

            for (MenuVO m : menuList) {
                pw.printf("%d,%s,%d,%s,%s\n",
                        m.getId(), m.getName(), m.getPrice(), m.getCategory(),
                        m.isSold() ? "Y" : "N");
            }
            System.out.println(">>> 데이터 저장 완료.");
        } catch (IOException e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }
    }
    


}
