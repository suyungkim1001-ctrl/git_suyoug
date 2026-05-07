## 주요 기능
- 메뉴번호, 메뉴이름, 가격, 카테고리, 판매여부를 CSV형식으로 관리

src/
└── MyJava/
├── main/
│   └── MenuMain.java        # 프로그램 실행 진입점 및 메인 루프 제어
├── service/
│   └── MenuService.java        # CSV 파일 로드/저장 및 비즈니스 로직 담당
├── vo/
│   └── MenuVO.java             # 메뉴 데이터를 담는 가치 객체 (Value Object)
└── controller/
├── Controller.java         # 모든 기능 컨트롤러의 표준 인터페이스
├── HandlerMapping.java     # 사용자의 입력 번호와 컨트롤러를 연결 (Factory)
├── AppendController.java    # 메뉴 등록 로직
├── DeleteController.java    # 메뉴 삭제 로직
├── UpdateController.java    # 메뉴 정보 수정 로직
└── PrintAllController.java  # 전체 메뉴 목록 출력 로직