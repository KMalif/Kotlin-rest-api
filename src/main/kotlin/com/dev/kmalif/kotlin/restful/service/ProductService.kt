package com.dev.kmalif.kotlin.restful.service

import com.dev.kmalif.kotlin.restful.model.CreateProductRequest
import com.dev.kmalif.kotlin.restful.model.ListProductRequest
import com.dev.kmalif.kotlin.restful.model.ProductResponse
import com.dev.kmalif.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}