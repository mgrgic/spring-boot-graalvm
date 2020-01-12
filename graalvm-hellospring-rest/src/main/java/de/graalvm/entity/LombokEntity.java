package de.graalvm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class LombokEntity {
    private String foo;
    private Boolean isBar;
}
