package com.wangdaye.mysplash.common._basic;

/**
 * Flag runnable.
 *
 * A Runnable class with a running flag. The flag can be used as a loop condition.
 *
 * */

public abstract class FlagRunnable implements Runnable {
    // data
    private boolean running = true;

    /** <br> life cycle. */

    public FlagRunnable(boolean running) {
        this.running = running;
    }

    /** <br> data. */

    public void setRunning(boolean b) {
        this.running = b;
    }

    public boolean isRunning() {
        return running;
    }
}