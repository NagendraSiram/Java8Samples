package com.home.samples.codility.globalrelay;

/**
 * Created by nagendra on 24/04/2021.
 */
import java.util.Optional;

public class UserStats {

    Optional<Long> visitCount;

    public UserStats(Long value) {
        visitCount = Optional.ofNullable(value);
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }
}
