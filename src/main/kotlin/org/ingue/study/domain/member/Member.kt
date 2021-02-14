package org.ingue.study.domain.member

import org.ingue.study.domain.support.CreatedAndModifiedEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(
    var memberPassword: String,
    var memberName: String,
    var memberStateMessage: String? = null,
    var memberProfileUrl: String? = null,
    var memberEmail: String,
    var memberBirthDate: LocalDate,
    var memberPhoneNumber: String,
    var memberKakaoId: String,
    var withdrawAt: LocalDateTime? = null
) : CreatedAndModifiedEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var memberId: Long? = null
}