package pl.jankowiak.testform.exceptions;

public class MyException {

    private ExceptionInfo exceptionInfo;

    public MyException(ExceptionCode exceptionCode, String exceptionMessage) {
        this.exceptionInfo = new ExceptionInfo(exceptionCode, exceptionMessage);
    }

    public ExceptionInfo getExceptionInfo() {
        return exceptionInfo;
    }
}
