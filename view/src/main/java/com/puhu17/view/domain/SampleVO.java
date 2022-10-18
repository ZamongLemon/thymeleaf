package com.puhu17.view.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SampleVO {
    private Long idx;
    private String email;
    private String name;
    private String id;
    private String pw;
    private LocalDateTime regTime;
}

