package com.study.selfapplication.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Hobby {

    Exercise("Exercise", "야외활동"),
    Book("Book", "실내활동");

    private final String key;
    private final String title;
}
