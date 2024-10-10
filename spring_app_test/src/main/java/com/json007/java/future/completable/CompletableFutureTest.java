package com.json007.java.future.completable;

import java.util.concurrent.CompletableFuture;

/**
 * @author: chao.an
 * @since: 2024-09-25 21:08
 */
public class CompletableFutureTest {

    public static void main(String[] args) {
        CompletableFuture<String> cf = new CompletableFuture<String>();
        cf.complete("hello");
        try {
            String result = cf.get();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
