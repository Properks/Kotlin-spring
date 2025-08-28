package org.jeongmo.practice.global.config

import org.jeongmo.practice.global.annotation.resolver.AuthenticatedMemberResolver
import org.springframework.context.annotation.Configuration
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig(
    private val authenticatedMemberResolver: AuthenticatedMemberResolver,
): WebMvcConfigurer {

    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        resolvers.add(authenticatedMemberResolver)
    }
}