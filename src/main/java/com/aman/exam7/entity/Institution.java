package com.aman.exam7.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Builder
@Data
public class Institution {

    @Id
    private String id;

    private String nameInstitution;
    private String description;
}
