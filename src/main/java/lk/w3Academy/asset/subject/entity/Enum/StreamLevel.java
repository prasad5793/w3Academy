package lk.w3Academy.asset.subject.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StreamLevel {
    OL("Ordinary Level"),
    AL("Advance Level");

    private final String streamLevel;
}
