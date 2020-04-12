package ru.job4j.oop.pojo;

public class Shop {

    /**
     * Удаление ячейки из массива по ее индексу
     * Сдвиг заполненных ячеек на место освобождённых
     * @param products
     * @param index
     * @return возвращает массив без пробелов
     */

    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            if (products[i] != null) {
                products[i] = products[i++];
                products[i] = null;
            }
            products[products.length - 1] = null;
        }
        return products;
    }
}
