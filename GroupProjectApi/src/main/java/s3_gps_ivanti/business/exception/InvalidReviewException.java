package s3_gps_ivanti.business.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidReviewException extends ResponseStatusException {
    public InvalidReviewException() {
        super(HttpStatus.BAD_REQUEST, "INVALID_REVIEW");
    }
}