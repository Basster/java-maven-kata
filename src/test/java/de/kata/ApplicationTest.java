package de.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {

    private final Application application = new Application();

    @Test
    void sayHello() {
        // Given
        String expected = "Hello";

        // When
        String result = application.sayHello();

        // Then
        assertThat(result).isEqualTo(expected);
    }

}
