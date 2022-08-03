package tn.orange.myapplication.data.product

import tn.orange.myapplication.data.product.mapper.ProductDataToDomainMapper
import tn.orange.myapplication.domain.product.ProductRepository

class ProductRepositoryImpl(
    private val productDataSource: ProductDataSource,
    private val domainMapper: ProductDataToDomainMapper
) : ProductRepository {

    override fun getAllProducts() = productDataSource.getAllProducts()

    override fun getFirstProduct() = productDataSource.getAllProducts().first()

    override fun lastProduct() = productDataSource.getAllProducts().last()
}