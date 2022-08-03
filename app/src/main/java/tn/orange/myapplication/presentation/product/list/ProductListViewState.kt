package tn.orange.myapplication.presentation.product.list

data class ProductListViewState(
    val products: List<String> = emptyList(),
    val title: String = "Products Screen"
)