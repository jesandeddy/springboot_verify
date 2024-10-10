package com.json007.java.future.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author: chao.an
 * @since: 2024-09-26 09:37
 */
public class CompletableFutureSequenceTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> {
            return "hello";
        });
        completableFuture.thenApply(result -> {throw new RuntimeException();});
        completableFuture.handle((result, ex) -> {
            if (ex != null) {
                System.out.println("error: " + ex);
            } else {
                System.out.println(result);
            }
            return result;
        });
        completableFuture.thenApply(result -> result + " result");
        System.out.println(completableFuture.get());
    }
}

