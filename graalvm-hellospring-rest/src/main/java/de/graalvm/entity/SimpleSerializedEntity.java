package de.graalvm.entity;

import java.io.Serializable;

public class SimpleSerializedEntity implements Serializable {

    static final long serialVersionUID = 1L;

    private String foo;
    private Boolean isBar;

    public SimpleSerializedEntity() {}

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public Boolean getBar() {
        return isBar;
    }

    public void setBar(Boolean bar) {
        isBar = bar;
    }

}
