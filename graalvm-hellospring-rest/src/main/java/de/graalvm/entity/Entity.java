package de.graalvm.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Entity {
    private String foo;
    private Boolean isBar;
}
