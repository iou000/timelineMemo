package com.sparta.timelineMemo.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //Timestamped 클래스를 상속한 클래스는 자동으로 생성시간, 수정시간을 컬럼으로 잡음.
@EntityListeners(AuditingEntityListener.class) // 생성/변경 시간을 자동으로 업데이트합니다.
public abstract class Timestamped { //abstract : 상속으로만 사용할 수 있음.

    @CreatedDate //생성시간
    private LocalDateTime createdAt;

    @LastModifiedDate //수정시간
    private LocalDateTime modifiedAt;
}
