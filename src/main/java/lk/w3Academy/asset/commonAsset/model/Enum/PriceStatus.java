package lk.w3Academy.asset.commonAsset.model.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PriceStatus {
    VALID("Valid"),
    NOTVALID("Not Valid");

    private final String priceStatus;

}
