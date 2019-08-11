package pl.jankowiak.testform.model;

public enum EstimatedRentalTime {
    ONE_DAY("1 day"),
    TWO_DAYS("2 days"),
    THREE_DAYS("2 days"),
    FIVE_DAYS("5 days"),
    SEVEN_DAYS("7 days"),
    TEN_DAYS("10 days"),
    ;

    private final String value;

    EstimatedRentalTime(final String newValue) {
        value = newValue;
    }

    public String getValue() {
        return value;
    }
}
