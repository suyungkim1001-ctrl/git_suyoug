package MyJava.service;

import MyJava.vo.MenuVO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<MenuVO> menuList = new ArrayList<>();
    private final String FILE_PATH = "menu.csv";

    // [1. 프로그램 시작 시 로드]
    public void load() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return; // 파일이 없으면 그냥 리턴

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); // 헤더(컬럼명) 스킵

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                // CSV 문자열 데이터를 객체로 변환하여 리스트에 추가
                menuList.add(new MenuVO(
                        Integer.parseInt(d[0].trim()), // id
                        d[1].trim(),                   // name
                        Integer.parseInt(d[2].trim()), // price
                        d[3].trim(),                   // category
                        d[4].trim().equalsIgnoreCase("Y") // isSold
                ));
            }
            System.out.println("데이터 로드 완료 (" + menuList.size() + "개)");
        } catch (Exception e) {
            System.out.println("로드 중 오류 발생: " + e.getMessage());
        }
    }

    // [2. 프로그램 종료 시 저장]
    public void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            // 헤더 작성
            pw.println("메뉴번호,메뉴이름,가격,카테고리,판매여부");

            for (MenuVO m : menuList) {
                pw.printf("%d,%s,%d,%s,%s\n",
                        m.getId(), m.getName(), m.getPrice(), m.getCategory(),
                        m.isSold() ? "Y" : "N");
            }
            System.out.println("데이터가 안전하게 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("저장 중 오류 발생: " + e.getMessage());
        }
    }

    // CRUD 메서드들 (addMenu, deleteMenu 등)은 menuList를 대상으로 수행...
}
