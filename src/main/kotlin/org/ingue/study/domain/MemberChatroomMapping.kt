package org.ingue.study.domain

import org.ingue.study.domain.member.Member
import org.ingue.study.domain.support.CreatedAndModifiedEntity
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "member_chatroom_mapping")
class MemberChatroomMapping(
    var chatroomName: String,
    var joinAt: LocalDateTime
) : CreatedAndModifiedEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var memberChatroomId: Long? = null

    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: Member? = null

    @ManyToOne
    @JoinColumn(name = "chatroomId")
    var chatroom: Chatroom? = null
}