package org.ingue.study.domain

import org.ingue.study.domain.member.Member
import org.ingue.study.domain.support.CreatedAndModifiedEntity
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Chat(
    var chatMessage: String? = null,
    var chatStatus: String? = null,
    var withdrawAt: LocalDateTime? = null
) : CreatedAndModifiedEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var chatId: Long? = null

    @ManyToOne
    @JoinColumn(name = "chatroomId")
    var chatroom: Chatroom? = null

    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: Member? = null
}