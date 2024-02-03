package io.github.anjeyy.explainingconstants;

import java.net.http.HttpResponse;

class Example {

    private static final int PAGE_NOT_FOUND = 404;

    void before(HttpResponse<String> httpResponse) {
        if (httpResponse.statusCode() == 404) {
            throw new RuntimeException("Error.");
        }
    }

    void after(HttpResponse<String> httpResponse) {
        if (httpResponse.statusCode() == PAGE_NOT_FOUND) {
            throw new RuntimeException("Error.");
        }
    }
}
