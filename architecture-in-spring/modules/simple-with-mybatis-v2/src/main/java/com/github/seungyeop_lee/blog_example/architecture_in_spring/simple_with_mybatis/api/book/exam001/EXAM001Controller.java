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

        EXAM001Service.Result result = service.createBook(request.toCommand());

        return Response.from(result);
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

        public EXAM001Service.Command toCommand() {
            return EXAM001Service.Command.of(title, isbn, publishedDate);
        }
    }

    @Getter
    static class Response extends BaseApiResponse {
        private Long bookId;
        private String title;
        private String isbn;
        private LocalDate publishedDate;

        public static Response from(EXAM001Service.Result result) {
            Response response = new Response();
            response.bookId = result.getBookId();
            response.title = result.getTitle();
            response.isbn = result.getIsbn();
            response.publishedDate = result.getPublishedDate();
            response.markOk();
            return response;
        }
    }
}
