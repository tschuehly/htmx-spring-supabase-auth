package io.supabase.supabasespringbootstarter.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ConfigurationProperties("supabase")
@PropertySource("classpath:application-supabase.properties")
class SupabaseProperties {
    lateinit var projectId: String
    lateinit var databasePassword: String
    lateinit var anonKey: String
    lateinit var jwtSecret: String
    val public = Public()

    class Public {
        var get: Array<String> = arrayOf()
        var post: Array<String> = arrayOf()
        var delete: Array<String> = arrayOf()
        var put: Array<String> = arrayOf()
    }

    val roles = Roles()

    class Roles {
        lateinit var get: Map<String, List<String>>
        lateinit var post: Map<String, Array<String>>
        lateinit var delete: Map<String, Array<String>>
        lateinit var put: Map<String, Array<String>>

    }
}
