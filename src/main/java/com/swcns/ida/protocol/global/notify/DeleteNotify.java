package com.swcns.ida.protocol.global.notify;

import com.swcns.ida.protocol.global.Notify;

public abstract class DeleteNotify<T> extends Notify<T> {
    public DeleteNotify(T payload) {
        super(NotifyType.DELETE, payload);
    }
}
