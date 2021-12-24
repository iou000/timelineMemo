package com.sparta.timelineMemo.service;

import com.sparta.timelineMemo.domain.Memo;
import com.sparta.timelineMemo.domain.MemoRepository;
import com.sparta.timelineMemo.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final 로 선언된 멤버변수의 생성자를 자동생성 해줌.
@Service // SQL 같이 업데이트 하는 작용이 일어날 수 있는.. 그런.. 서비스임을 스프링에게 알려줌.
public class MemoService {

    final private MemoRepository memoRepository;

    @Transactional //SQL 쿼리가 일어나야 함을 명시. (DB에 반영되어야 함)
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new NullPointerException("id가 존재하지 않습니다.")
        );

        memo.update(requestDto);
        return id;
    }
}
