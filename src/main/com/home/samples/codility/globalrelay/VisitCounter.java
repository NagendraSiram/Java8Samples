package com.home.samples.codility.globalrelay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
/**
 * Created by nagendra on 24/04/2021.
 */
public class VisitCounter {
    /*
       refer codility-visitCounter.jpg
     */
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        final Map<Long, Long> countMap = new HashMap<>();
        if (visits == null || visits.length == 0) {
            return countMap;
        }

        Arrays.asList(visits).stream().filter(map -> map != null && !map.isEmpty()).forEach(map -> {
            map.keySet().stream().filter(userId -> userId != null && userId.matches("\\d")).forEach(key -> {
                UserStats value = map.get(key);
                Optional<Long> visitCount = value != null ? value.getVisitCount() : Optional.empty();
                if (visitCount.isPresent()) {
                    Long userId = Long.valueOf(key);
                    Long existingCount = countMap.getOrDefault(userId, 0L);
                    countMap.put(userId, visitCount.get() + existingCount);
                }
            });
        });
        return countMap;
    }
}