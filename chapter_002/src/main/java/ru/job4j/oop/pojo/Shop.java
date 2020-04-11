package ru.job4j.oop.pojo;

public class Shop {

    /**
     * Удаление ячейки из массива
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
        }
        return products;
    }
}

    //
    //Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.

     //   products[index] = products[index + 1];

       // После цикла нужно поставить на последнее место в массиве null, чтобы последний и предпоследний элементы не дублировались

      //  products[products.lenght - 1] = null;