package jjfactory.url_shortener.business.url.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Url(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    val destinationUrl: String,
    @Column(unique = true)
    val shortUrl: String,

    val createAt: LocalDateTime,
    var lastClickedAt: LocalDateTime,

    val password: String,
    var totalClickCount : Long,
) {

    fun clickUrl() {
        lastClickedAt = LocalDateTime.now()
        totalClickCount++
    }
}