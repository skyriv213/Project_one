package com.study.shoppping.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter // 값을 가져오는 Getter은 가능
//@Setter // 수정을 방지하기위해, 보안을 위해 Setter은 제외

public class Customer extends People {
    private String id, password, name, phoneNumber;
    private Grade grade;
    private int age;

    @Builder
    public Customer(String id, String password, Grade grade) {
        this.id = id;
        this.password = password;
        this.grade = grade;
    }


}
