package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam002;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.exception.RequiredValueException;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response.BaseApiResponse;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class EXAM002Controller {
    private final EXAM002Service service;

    @PostMapping("/readBook")
    public Response readBook(@RequestBody Request request) {
        request.validate();

        DataManager dataManager = new DataManager(request);

        service.readBook(dataManager);

        return dataManager.buildResponse();
    }

    @Data
    static class Request {
        private Long bookId;

        public void validate() {
            if (bookId == null) {
                throw new RequiredValueException();
            }
        }
    }

    @Getter
    static class Response extends BaseApiResponse {
        private Long bookId;
        private String title;
        private String isbn;
        private LocalDate publishedDate;

        public static Response of(
                Long bookId,
                String title,
                String isbn,
                LocalDate publishedDate
        ) {
            Response response = new Response();
            response.bookId = bookId;
            response.title = title;
            response.isbn = isbn;
            response.publishedDate = publishedDate;
            response.markOk();
            return response;
        }
    }
}
