package jjfactory.url_shortener.business.url.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class AccessLog (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    val ip: String,
    val userAgent: String,
    val referrer: String,
    val clickedAt: LocalDateTime,

    @ManyToOne(fetch = FetchType.LAZY)
    val url:Url,
){
//    fun create() : AccessLog {
//
//    }
}