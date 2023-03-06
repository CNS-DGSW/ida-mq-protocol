package com.swcns.ida.protocol.user.data;

import com.swcns.ida.protocol.user.type.UserRole;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private Long id;
    private String email;
    private String name;
    private UserRole role;
}
