package com.study.shoppping.employee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    public String id, password;

    private Rank rank;
    private String name;
    private int age;

    @Builder
    public Employee(String id, Rank rank){
        this.id = id;
        this.rank = rank;
    }
}
