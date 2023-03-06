package com.swcns.ida.protocol.global.notify;

import com.swcns.ida.protocol.global.Notify;

public abstract class SelectNotify<T> extends Notify<T> {
    public SelectNotify(T payload) {
        super(NotifyType.SELECT, payload);
    }
}
