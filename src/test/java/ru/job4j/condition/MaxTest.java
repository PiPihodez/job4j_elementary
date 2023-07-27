package ru.job4j.condition;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void max() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    private <SELF extends AbstractBigDecimalAssert<SELF>> AbstractBigDecimalAssert assertThat(int result) {
        return null;
    }
}