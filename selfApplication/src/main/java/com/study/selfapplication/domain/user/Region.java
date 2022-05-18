package com.study.selfapplication.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Region {
    경기("경기"),
    서울("서울"),
    인천("인천");

    private final String Region;

}
