package com.romaneekang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentDto {
    @JsonProperty("stuNo")
    private Integer stuNo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;

}
