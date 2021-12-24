package com.sparta.timelineMemo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor //기본생성자
@Getter
@Entity //테이블임
public class Memo extends Timestamped { //생성, 수정시간 자동으로 생성
    @GeneratedValue(strategy = GenerationType.AUTO) //id 자동증가
    @Id //기본키
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    public Memo(String username, String contents) { //생성자
        this.username = username;
        this.contents = contents;
    }

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void update(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

}

