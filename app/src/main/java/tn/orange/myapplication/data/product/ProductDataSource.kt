package tn.orange.myapplication.data.product

class ProductDataSource(
    private val productDatabaseSource: ProductDatabaseSource,
    private val productService: ProductService
) {

    fun getAllProducts() = productService.fetchProducts().toMutableList()
}