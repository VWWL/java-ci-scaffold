package com.example.scaffold.frameworks.test.web;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CanaryTest {

    @Test
    void should_be_able_to_run_tests() {
        assertThat("ok").isEqualTo("ok");
    }

}
