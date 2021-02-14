package org.ingue.study.domain.relationship

import org.ingue.study.domain.member.Member
import org.ingue.study.domain.support.CreatedAndModifiedEntity
import javax.persistence.*

@Entity
class RelationShip(
    var friendName: String,

    @Enumerated(EnumType.STRING)
    var friendStatus: RelationShipStatus
) : CreatedAndModifiedEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var relationShipId: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    var member: Member? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "friendId")
    var friend: Member? = null
}