package tn.orange.myapplication.domain.product

interface ProductRepository {

    fun getAllProducts(): List<String>
    fun getFirstProduct(): String
    fun lastProduct(): String
}