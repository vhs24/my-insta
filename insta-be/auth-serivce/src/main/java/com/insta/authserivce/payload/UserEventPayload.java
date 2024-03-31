package com.insta.authservice.payload;


import com.insta.authservice.messaging.UserEventType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEventPayload {

    private String id;
    private String username;
    private String email;
    private String displayName;
    private String profilePictureUrl;
    private String oldProfilePicUrl;
    private UserEventType eventType;
}
