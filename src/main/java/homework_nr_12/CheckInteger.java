package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD(e-> e.isOdd()),
    CHECK_IF_EVEN(e-> e.isEven()),
    CHECK_IF_NEGATIVE(e-> e.isNegative()),
    CHECK_IF_POSITIVE(e -> e.isPositive());

    Predicate<IntegerNumber> filter;

    CheckInteger(Predicate<IntegerNumber> filter) {
        this.filter = filter;

    }
}

