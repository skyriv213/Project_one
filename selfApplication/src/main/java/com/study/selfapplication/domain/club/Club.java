package com.study.selfapplication.domain.club;

import com.study.selfapplication.domain.user.Hobby;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor
public class Club {


    private ClubName clubName;

    private Hobby hobby;

    private

}
