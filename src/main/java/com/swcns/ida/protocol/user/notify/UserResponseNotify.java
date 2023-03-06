package com.swcns.ida.protocol.user.notify;

import com.swcns.ida.protocol.global.notify.SelectNotify;
import com.swcns.ida.protocol.user.data.User;

public class UserResponseNotify extends SelectNotify<User> {
    /**
     * User 조회에 응답하는 Notify
     * @param payload 조회된 사용자
     */
    public UserResponseNotify(User payload) {
        super(payload);
    }
}
