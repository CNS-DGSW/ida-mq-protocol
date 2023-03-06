package com.swcns.ida.protocol.global.notify;

import com.swcns.ida.protocol.global.Notify;

public abstract class UpdateNotify<T> extends Notify<T> {
    public UpdateNotify(T payload) {
        super(NotifyType.UPDATE, payload);
    }
}
