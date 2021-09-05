package net.frank.api.kafka.service;

import net.frank.api.kafka.domain.Factor;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Function;

@Service
public class GeneratorServiceImpl implements GeneratorService{
    @Override
    public int randomFactor() {
        Function<String, Integer> function = Integer::parseInt;
        int a = function.apply(Factor.MAX.toString());
        int b = function.apply(Factor.MIN.toString());
        int c = function.apply(Factor.MIN.toString());
        return new Random().nextInt(a - b + 1) + c;
    }
}