package org.feuyeux.java.hello;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@Service
public class SlySmileService {
    private List<SlySmile> cache = new CopyOnWriteArrayList<>();
    private int interval = 1;
    @PostConstruct
    public void init() {
        System.out.println("SlySmile: ^_^");
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(interval);
                IntStream.range(1,100_000).parallel().forEach(i -> {
                    cache.add(new SlySmile(
                            "Smile_" + System.currentTimeMillis(),
                            "watching me",
                            "^_^"
                    ));
                });
                System.out.println(interval+ " Cache size: " + cache.size());
                interval++;
            } catch (InterruptedException ignored) {
            }
        }
    }
}
