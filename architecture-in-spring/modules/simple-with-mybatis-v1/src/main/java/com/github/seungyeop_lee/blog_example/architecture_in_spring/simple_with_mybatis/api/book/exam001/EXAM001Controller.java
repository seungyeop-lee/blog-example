package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam001;

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
public class EXAM001Controller {

    private final EXAM001Service service;

    @PostMapping("/createBook")
    public Response createBook(@RequestBody Request request) {
        request.validate();

        DataManager dataManager = new DataManager(request);

        service.createBook(dataManager);

        return dataManager.buildResponse();
    }

    @Data
    static class Request {
        private String title;
        private String isbn;
        private LocalDate publishedDate;

        public void validate() {
            if (title == null || isbn == null || publishedDate == null) {
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
