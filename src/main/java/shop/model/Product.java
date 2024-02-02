package shop.model;

import lombok.*;

/**
 * Класс товара для инернет магазина
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    /**
     * Наименование товара
     */
    private String title;
    /**
     * Артикул товара
     */
    private int article;
    /**
     * Описание товара
     */
    private String description;
    /**
     * Стоимость товара
     */
    private double cost;
    /**
     * Ссылка на изображение товара
     */
    private String imageURL;

    public void setImageURL(String imageURL) {
        //если нет ссылки на товар, добавляем заглушку /img/no-photo.jpg
        if ("".equals(imageURL)) this.imageURL = "/img/no-photo.jpg";
        else this.imageURL = imageURL;
    }

}