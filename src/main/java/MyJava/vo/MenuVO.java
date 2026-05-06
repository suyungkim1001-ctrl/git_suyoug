package MyJava.vo;

public class MenuVO {
    private int id;
    private String name;
    private int price;
    private String category;
    private boolean isSold;

    public MenuVO() {}

    public MenuVO(int id, String name, int price, String category, boolean isSold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.isSold = isSold;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public boolean isSold() { return isSold; }

    public void setSold(boolean sold) { isSold = sold; }
    
    @Override
    public String toString() {
        return String.format("[%d] %-10s | 가격: %d | 분류: %s | 판매중: %s",
                id, name, price, category, isSold ? "Y" : "N");
    }
}
