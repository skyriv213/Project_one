package com.study.selfapplication.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Hobby hobby;

    @Column
    private Region region;

    @Builder
    public User(String name, Hobby hobby, Region region) {
        this.name = name;
        this.hobby = hobby;
        this.region = region;
    }

    public User Update(String name, Hobby hobby) {
        this.name = name;
        this.hobby = hobby;

        return this;
    }

    public String getHobbyKey() {
        return this.hobby.getKey();
    }

}
