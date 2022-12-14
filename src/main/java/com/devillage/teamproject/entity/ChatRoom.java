package com.devillage.teamproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class ChatRoom extends AuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(name="chatroom_id")
    private Long id;

    @OneToMany(mappedBy = "chatroom")
    private List<Chat> chat;

    @OneToMany(mappedBy = "chatroom")
    private List<ChatIn> chatIn;
}
