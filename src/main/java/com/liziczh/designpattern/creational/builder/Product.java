package com.liziczh.designpattern.creational.builder;

/**
 * 建造者模式
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public class Product {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 建造者
     */
    public static Product.Builder builder() {
        return new Product.Builder();
    }

    /**
     * 建造者静态类
     */
    private static class Builder {

        private final Product product = new Product();

        public Product.Builder id(Long id) {
            product.setId(id);
            return this;
        }

        public Product.Builder name(String name) {
            product.setName(name);
            return this;
        }

        public Product build() {
            return this.product;
        }

    }

    public static void main(String[] args) {
        Product product = Product.builder()
                .id(1L)
                .name("iPhone")
                .build();
        System.out.println(product);
    }
}
