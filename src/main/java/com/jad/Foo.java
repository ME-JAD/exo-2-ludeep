package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private final IBaz baz;
    private final List<IBar> bars = new ArrayList<>();
    private final IQux qux;
    private ICorge corge;

    public Foo(final IBaz baz, IQux qux) {
        this.baz = baz;
        this.qux = qux;
    }

    public List<IBar> getBars() {
        return new ArrayList<>(this.bars);
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public IQux getQux() {
        return this.qux;
    }
}