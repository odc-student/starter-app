package tn.orange.myapplication.domain.product.usecase

import tn.orange.myapplication.domain.product.ProductRepository

class GetAllProductsUseCase(
    private val productRepository: ProductRepository
) {

    fun execute() = productRepository.getAllProducts()
}