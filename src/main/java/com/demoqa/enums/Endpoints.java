package com.demoqa.enums;

import lombok.Getter;

public enum Endpoints {

    ALERT("/alert"),
    FRAMES("/frames");

    @Getter
    String endpoint;

    Endpoints(String endpoint){
        this.endpoint = endpoint;
    }
}
