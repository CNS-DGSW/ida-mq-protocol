package com.swcns.ida.protocol.global.notify;

import com.swcns.ida.protocol.global.Notify;

public abstract class CreateNotify<T> extends Notify<T> {
    public CreateNotify(T payload) {
        super(NotifyType.CREATE, payload);
    }
}
