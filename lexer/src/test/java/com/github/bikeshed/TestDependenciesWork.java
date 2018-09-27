package com.github.bikeshed;

import org.assertj.core.api.Assertions;
import org.immutables.value.Value;
import org.junit.jupiter.api.Test;

/**
 * Semi-silly set of tests to make sure my dependencies have been correctly installed.
 */
class TestDependenciesWork {

    @Test
    void test_assertions_are_enabled() {
        boolean test = false;
        assert (test = true);
        if (!test) {
            throw new AssertionError("Assertions are not enabled");
        }
    }

    @Test
    void test_immutables_library_working() {
        ImmutablesTest immutablesTest = ImmutableImmutablesTest.builder()
                .name("testing")
                .build();

        Assertions.assertThat(immutablesTest)
                .as("check immutables is working")
                .hasFieldOrPropertyWithValue("name", "testing");
    }

    @Value.Immutable
    interface ImmutablesTest {
        String getName();
    }
}
