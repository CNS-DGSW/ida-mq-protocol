package com.swcns.ida.protocol.user.notify;

import com.swcns.ida.protocol.global.notify.SelectNotify;

public class UserRequestNotify extends SelectNotify<Long> {
    /**
     * User의 조회를 요청하는 Notify
     * @param userId 조회할 사용자의 아이디
     */
    public UserRequestNotify(Long userId) {
        super(userId);
    }
}
