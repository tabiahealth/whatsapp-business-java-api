package com.whatsapp.api.configuration;

public enum ApiVersion {

    @Deprecated()
    V16_0("v16.0"),
    V17_0("v17.0"),
    V18_0("v18.0"),
    V19_0("v19.0"),
    V20_0("v20.0"),
    V21_0("v21.0"),
    V22_0("v22.0"),
    V23_0("v23.0"),
    V24_0("v24.0"),
    V25_0("v25.0");



    private final String value;

    ApiVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
