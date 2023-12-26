package net.neoforged.dummytesting;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum: " + add(Stream.of(args).mapToInt(Integer::valueOf).toArray()));
        System.out.println("It's actually that, trust me bro. k?");
    }

    public static int add(int... values) {
        int sum = 0;
        for (int value : values) sum += value;
        return sum;
    }
}
