package de.graalvm.entity;

public class SimpleEntity  {

    private Integer id;
    private String foo;
    private Boolean isBar;

    public SimpleEntity() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
