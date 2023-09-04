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

        EXAM002Service.Result result = service.readBook(request.toCommand());

        return Response.from(result);
    }

    @Data
    static class Request {
        private Long bookId;

        public void validate() {
            if (bookId == null) {
                throw new RequiredValueException();
            }
        }

        public EXAM002Service.Command toCommand() {
            return EXAM002Service.Command.of(bookId);
        }
    }

    @Getter
    static class Response extends BaseApiResponse {
        private Long bookId;
        private String title;
        private String isbn;
        private LocalDate publishedDate;

        public static Response from(EXAM002Service.Result result) {
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
