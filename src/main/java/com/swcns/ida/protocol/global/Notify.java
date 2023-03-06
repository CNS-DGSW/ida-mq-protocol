package com.swcns.ida.protocol.global;

import com.swcns.ida.protocol.global.notify.NotifyType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Notify<T> {
    private final NotifyType type;
    private final T payload;
}
