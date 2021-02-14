package org.ingue.study.domain.support

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(value = [AuditingEntityListener::class])
class CreatedAndModifiedEntity {

    @CreatedDate
    val createdAt: LocalDateTime? = null

    @LastModifiedDate
    val modifiedAt: LocalDateTime? = null
}