package com.wentong.tinyflow.util;

import java.util.UUID;

public final class IdGenerator {
    private IdGenerator() {
    }

    public static String getId() {
        return UUID.randomUUID().toString();
    }
}
