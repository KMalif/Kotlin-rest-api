package com.dev.kmalif.kotlin.restful.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.dev.kmalif.kotlin.restful.entity.Product

interface ProductRepository : JpaRepository<Product, String>{

}