package models;

import java.util.TreeMap;
import models.Product;

public class ReadCategoryProduct {
    
     //準備好產品清單  
    public static TreeMap<String, Product> readProduct() {
        //read_product_from_file(); //從檔案或資料庫讀入產品菜單資訊
        //放所有產品  產品編號  產品物件
        TreeMap<String, Product> product_dict = new TreeMap<>();
        String[][] product_array = {
            {"p-j-101", "經典雪花冰", "牛奶雪花冰", "45", "牛奶雪花冰.jpg", "產品描述"},
            {"p-j-102", "經典雪花冰", "草莓雪花冰", "55", "草莓雪花冰.jpg", "產品描述"},
            {"p-j-103", "經典雪花冰", "巧克力雪花冰", "55", "巧克力雪花冰.jpg", "產品描述"},
            {"p-j-104","經典雪花冰", "香檳葡萄", "60", "香檳葡萄雪花冰.jpg", "產品描述"},
            {"p-j-105","水果雪花冰", "新鮮草莓雪花冰", "75", "新鮮草莓雪花冰.jpg", "產品描述"},
            {"p-j-106", "水果雪花冰", "新鮮芒果雪花冰", "75", "新鮮芒果雪花冰.png", "產品描述"},
            {"p-j-107", "水果雪花冰", "新鮮西瓜雪花冰", "85", "新鮮西瓜雪花冰.jpg", "產品描述"},
            {"p-j-108", "配料", "珍珠", "10", "珍珠.jpg", "產品描述"},
            {"p-j-109", "配料", "抹茶凍", "15", "抹茶凍.jpg", "產品描述"},
            {"p-j-110", "配料", "布丁", "15", "布丁.jpg", "產品描述"},
           
        };

        //一筆放入字典變數product_dict中
        for (String[] item : product_array) {
            Product product = new Product(
                    item[0], 
                    item[1], 
                    item[2], 
                    Integer.parseInt(item[3]), //價格轉為int
                    item[4], 
                    item[5]);
            //將這一筆放入字典變數product_dict中 
            product_dict.put(product.getProduct_id(), product);
        }
        return product_dict; 
    }
}
