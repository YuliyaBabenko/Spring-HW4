package shop.controller;

import shop.model.Product;
import shop.services.ProductService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log
public class WebController {
    Product product;
    @Autowired
    ProductService productService;

    /** Обработчик стартовой страницы "/"
     * @param model
     * @return
     */
    @GetMapping("/")
    public String indexHtml(Model model){
        model.addAttribute(productService.getAllProducts());
        return "index";
    }

    /** Обработчик запроса на добавление товара
     * @param product товар (из request param)
     * @param model
     * @return возвращает стартовую страницу
     */
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String addProduct(Product product, Model model){
        System.out.println(product);
        productService.saveProduct(product);
        model.addAttribute(productService.getAllProducts());
        return "index";
    }

    /** Обработчик запроса на удаление товара
     *  с заданным артикулом
     * @param article номер артикула
     * @param model
     * @return переход на стартовую
     */
    @GetMapping("/del/{article}")
    public String delProduct(@PathVariable int article,Model model){
        System.out.println(article);
        productService.delProductByArticle(article);
        model.addAttribute(productService.getAllProducts());
        return "index";
    }

}
