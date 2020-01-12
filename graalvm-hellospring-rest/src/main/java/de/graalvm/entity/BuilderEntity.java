package de.graalvm.entity;

public class BuilderEntity {

    private String foo;
    private Boolean isBar;

    private BuilderEntity() {}

    public static BuilderEntity Builder(){
        return new BuilderEntity();
    }

    public BuilderEntity withFoo(String foo) {
        this.foo = foo;
        return this;
    }
    public BuilderEntity withBar(Boolean bar) {
        this.isBar = bar;
        return this;
    }

    public BuilderEntity build() {
        return this;
    }

}
