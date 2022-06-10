package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {

    private Product[] products = new Product[0];

    public void saveProduct(Product product) {
        Product[] tmp = new Product[products.length + 1];
        System.arraycopy(products, 0, tmp, 0, products.length);
        tmp[products.length] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(String id) {
        int index = 0;
        Product[] tmp = new Product[products.length - 1];
        for (int i = 0; i < products.length; i++) {
            if (!products[i].getId().equals(id)) {
                tmp[index] = products[i];
                index++;
            }
        }
        products = tmp;
    }
}
