package com.example.scaffold.frameworks.test.web;

import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseStatusMatcher {
    private final HttpStatus status;

    public ResponseStatusMatcher(HttpStatus status) {
        this.status = status;
    }

    public static ResponseStatusMatcher badStatus() {
        return new BadResponseStatusMatcher();
    }

    public static ResponseStatusMatcher createdStatus() {
        return new CreatedResponseStatusMatcher();
    }

    public static ResponseStatusMatcher eq(HttpStatus status) {
        return new EqStatusMatcher(status);
    }

    public static ResponseStatusMatcher errorStatus() {
        return new ErrorResponseStatusMatcher();
    }

    public static ResponseStatusMatcher forbiddenStatus() {
        return new ForbiddenResponseStatusMatcher();
    }

    public static ResponseStatusMatcher notFoundStatus() {
        return new NotFoundResponseStatusMatcher();
    }

    public static ResponseStatusMatcher okStatus() {
        return new OkResponseStatusMatcher();
    }

    public static ResponseStatusMatcher unauthorizedStatus() {
        return new UnauthorizedResponseStatusMatcher();
    }

    public void match(TestResponse response) {
        assertEquals(response.statusCode(), status);
    }
}
