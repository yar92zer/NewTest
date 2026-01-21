package org.example.newtest.CodeRetreat.TheMatrix;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class TheMatrix {
    private static final TheMatrix instance = new TheMatrix();
    private final Set<Human> connected = new CopyOnWriteArraySet<>();
    private volatile boolean online = true;

    private TheMatrix() {
        ScheduledExecutorService agents = Executors.newScheduledThreadPool(1);
        agents.scheduleAtFixedRate(() -> {
            if (online && Math.random() < 0.3) {
                System.out.println("\nAGENT SMITH: Mr. " + connected.stream().findAny().map(Human::getName).orElse("Anderson") + "...");
                throw new AgentSmithException();
            }

        }, 2, 2, TimeUnit.SECONDS);
    }

    public static TheMatrix getInstance() {
        return instance;
    }

    public void connect(Human human) {
        connected.add(human);
    }

    public void disconnect(Human human) {
        connected.remove(human);
    }

    public void crash() {
        online = false;
        System.out.println("\nMATRIX IS CRASHING... GREEN CODE DISAPPEARS...");
    }

    public Collection<Human> getConnected() {
        return new ArrayList<>(connected);
    }
}