package shop.DAO;

import shop.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Итнерфейс для работы с хранилищем товаров
 */
@Service
public interface IProductRepository {
    /** Получить все товара
     * @return
     */
    List<Product> getAllProducts();

    /** Получить товар по артикуду
     * @param article
     * @return товар
     */
    Product getProductByArticle(int article);

    /** Поиск товара по строке заропса
     * @param pattern  строка запросв
     * @return список товаров
     */
    List<Product> findProduct(String pattern);

    /** Запист товара в хранилище
     * @param product товар
     */
    void saveProduct(Product product);

    /** Удаление товара из хранилища
     * @param article
     */
    void delProductByArticle(int article);
}
