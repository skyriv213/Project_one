package com.study.selfapplication.domain.club;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ClubName {

    BookClub("Club_Book", "실내활동"),
    ExerciseClub("Club_Exercise", "야외활동");

    private final String key;
    private final String title;

}
