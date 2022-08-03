package tn.orange.myapplication.presentation.product.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tn.orange.myapplication.domain.product.usecase.GetAllProductsUseCase

class ProductListViewModel(
    private val getAllProductsUseCase: GetAllProductsUseCase
) : ViewModel() {

    private var _viewState = MutableLiveData<ProductListViewState>()
    val viewState: LiveData<ProductListViewState> = _viewState

    fun loadProducts() {
        val result = getAllProductsUseCase.execute()
        _viewState.value = ProductListViewState(products = result)
    }
}