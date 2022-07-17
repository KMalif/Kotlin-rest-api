package com.dev.kmalif.kotlin.restful.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.dev.kmalif.kotlin.restful.entity.ApiKey

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}