package jjfactory.url_shortener.global.interceptor

import jjfactory.url_shortener.global.provider.TokenProvider
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.HandlerInterceptor

@Configuration
class AccessLogInterceptor(
    private val tokenProvider: TokenProvider,
) {

}