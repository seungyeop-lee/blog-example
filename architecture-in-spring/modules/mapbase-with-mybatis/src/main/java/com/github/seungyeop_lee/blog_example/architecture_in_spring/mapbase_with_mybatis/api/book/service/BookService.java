package com.github.seungyeop_lee.blog_example.architecture_in_spring.mapbase_with_mybatis.api.book.service;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.mapbase_with_mybatis.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

    private final BookMapper mapper;

    public Map<String, Object> create(Map<String, Object> data) {
        // 필수 값 확인
        if (data.get("title") == null ||
                data.get("isbn") == null ||
                data.get("publishedDate") == null
        ) {
            Map<String, Object> response = new HashMap<>();
            response.put("resultCode", "0001");
            response.put("resultMessage", "필수 값이 누락되었습니다.");
            return response;
        }

        // ISBN 중복 확인
        Map<String, Object> book = mapper.readByIsbn(data.get("isbn").toString());
        if (book != null) {
            Map<String, Object> response = new HashMap<>();
            response.put("resultCode", "0002");
            response.put("resultMessage", "동일한 ISBN으로 등록 된 책이 있습니다.");
            return response;
        }

        // 책 생성
        mapper.create(data);

        // 응답 결과 적용
        data.put("bookId", Long.parseLong(data.get("bookId").toString()));
        data.put("resultCode", "0000");
        data.put("resultMessage", "정상 처리 되었습니다.");

        return data;
    }

    public Map<String, Object> readById(Map<String, Object> data) {
        // 필수 값 확인
        if (data.get("bookId") == null) {
            Map<String, Object> response = new HashMap<>();
            response.put("resultCode", "0001");
            response.put("resultMessage", "필수 값이 누락되었습니다.");
            return response;
        }

        // 책 조회
        Map<String, Object> book = mapper.readById(Long.parseLong(data.get("bookId").toString()));
        if (book == null) {
            Map<String, Object> response = new HashMap<>();
            response.put("resultCode", "0003");
            response.put("resultMessage", "해당 ID는 등록되지 않았습니다.");
            return response;
        }

        // 응답 결과 적용
        book.put("resultCode", "0000");
        book.put("resultMessage", "정상 처리 되었습니다.");

        return book;
    }
}
