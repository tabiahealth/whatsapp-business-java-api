package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public record WabaInfo(
        @JsonProperty("waba_id") String wabaId,
        @JsonProperty("owner_business_id") String ownerBusinessId
) {
}
