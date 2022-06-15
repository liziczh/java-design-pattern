package com.liziczh.designpattern.builder;

/**
 * 建造者模式
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public class User {

    private Long id;

    private String name;

    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 建造者
     */
    public static User.Builder builder() {
        return new User.Builder();
    }

    /**
     * 建造者静态类
     */
    private static class Builder {

        private User user = new User();

        public User.Builder id(Long id) {
            user.setId(id);
            return this;
        }

        public User.Builder name(String name) {
            user.setName(name);
            return this;
        }

        public User.Builder age(Integer age) {
            user.setAge(age);
            return this;
        }

        public User build() {
            return this.user;
        }

    }

    public static void main(String[] args) {
        User user = User.builder()
                .id(1L)
                .name("Tom")
                .age(18)
                .build();
        System.out.println(user);
    }
}
