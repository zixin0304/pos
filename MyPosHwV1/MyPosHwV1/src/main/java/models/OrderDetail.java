package models;

public class OrderDetail {

    private int id;
    private String order_num;
    private String product_id;
    private int quantity;
    private int product_price;
    private String product_name;
    private String product_photo;
    private boolean addCondensedMilk; // 新增的是否加煉乳字段

    // 更新構造函數以包含 addCondensedMilk
    public OrderDetail(String product_id, String product_name, int product_price, int quantity, boolean addCondensedMilk) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.quantity = quantity;
        this.addCondensedMilk = addCondensedMilk;
    }
    
    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_photo() {
        return product_photo;
    }

    public void setProduct_photo(String product_photo) {
        this.product_photo = product_photo;
    }
     public boolean isAddCondensedMilk() {
        return addCondensedMilk;
    }

    public void setAddCondensedMilk(boolean addCondensedMilk) {
        this.addCondensedMilk = addCondensedMilk;
    }

}
