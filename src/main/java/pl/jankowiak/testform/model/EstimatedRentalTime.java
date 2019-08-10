package pl.jankowiak.testform.model;

public enum EstimatedRentalTime {
    ONE_DAY(1),
    TWO_DAYS(2),
    THREE_DAYS(3),
    FIVE_DAYS(5),
    SEVEN_DAYS(7),
    TEN_DAYS(10),
    ;

    private final int value;

    EstimatedRentalTime(final int newValue) {
        value = newValue;
    }

    public int getValue() {
        return value;
    }
}
