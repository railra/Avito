package rahimov.Avito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rahimov.Avito.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/")
    public List<Product> products(){
        return Arrays.asList(new Product(1L), new Product(2L), new Product(3L));
    }
}
