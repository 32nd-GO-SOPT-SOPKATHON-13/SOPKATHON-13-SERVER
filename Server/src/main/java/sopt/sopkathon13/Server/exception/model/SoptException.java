package sopt.sopkathon13.Server.exception.model;

import lombok.Getter;
import sopt.sopkathon13.Server.exception.Error;

@Getter
public class SoptException extends RuntimeException {

    private final Error error;

    public SoptException(Error error, String message) {
        super(message);
        this.error = error;
    }

    public int getHttpStatus() {
        return error.getHttpStatusCode();
    }
}
