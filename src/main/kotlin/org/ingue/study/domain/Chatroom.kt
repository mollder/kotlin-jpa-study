package org.ingue.study.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Chatroom(
    var isDelete: Boolean = false,
    var withdrawAt: LocalDateTime? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var chatroomId: Long? = null

    @OneToMany(mappedBy = "member", cascade = [CascadeType.ALL], orphanRemoval = true)
    val memberChatroomMappings: List<MemberChatroomMapping> = arrayListOf()

}