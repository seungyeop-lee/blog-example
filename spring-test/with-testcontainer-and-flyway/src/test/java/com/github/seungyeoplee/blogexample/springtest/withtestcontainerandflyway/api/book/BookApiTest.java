package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.api.book;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.ApiTestSupport;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class BookApiTest extends ApiTestSupport {

    @Autowired
    TestRestTemplate rest;

    @Test
    void createAndReadBook() {
        CreateBookRequest createReq = buildCreateBookRequest();

        ResponseEntity<CreateBookResponse> createResEntity = rest.postForEntity("/book", createReq, CreateBookResponse.class);

        assertThat(createResEntity.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(createResEntity.getBody()).isNotNull();

        CreateBookResponse createRes = createResEntity.getBody();

        ResponseEntity<ReadBookResponse> readResEntity = rest.getForEntity("/book/{id}", ReadBookResponse.class, createRes.getBookId());

        assertThat(readResEntity.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(readResEntity.getBody()).isNotNull();
        assertThat(readResEntity.getBody().getBookId()).isNotNull();
        assertThat(readResEntity.getBody())
                .extracting("title", "isbn", "publishedDate")
                .containsExactly(createReq.getTitle(), createReq.getIsbn(), createReq.getPublishedDate());
    }

    @NotNull
    private static CreateBookRequest buildCreateBookRequest() {
        CreateBookRequest createReq = new CreateBookRequest();
        createReq.setTitle("api테스트제목");
        createReq.setIsbn("123987467");
        createReq.setPublishedDate(LocalDate.now());
        return createReq;
    }
}
