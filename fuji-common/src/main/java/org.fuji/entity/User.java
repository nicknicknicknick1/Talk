package org.fuji.entity;

import lombok.Data;

/**
 * @Author Nick
 * @CreateTime 2020/10/4
 */
@Data
public class User {

    private String id;
    private String name;
    private String age;
    private String phone;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User() {
    }

    public User(String id, String name, String age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
}
