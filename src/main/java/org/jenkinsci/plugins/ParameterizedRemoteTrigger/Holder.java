package org.jenkinsci.plugins.ParameterizedRemoteTrigger;

public class Holder<H> {

    private H mHeld;

    public Holder() {
        this(null);
    }

    public Holder(H held) {
        mHeld = held;
    }

    public H get() {
        return mHeld;
    }

    public void set(H held) {
        mHeld = held;
    }

}
