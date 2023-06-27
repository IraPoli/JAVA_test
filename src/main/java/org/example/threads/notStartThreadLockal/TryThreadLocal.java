package org.example.threads.notStartThreadLockal;

public class TryThreadLocal {
    ThreadLocal<Object> threadLocal = ThreadLocal.withInitial(()->{
        return  new Object();
    });
}
