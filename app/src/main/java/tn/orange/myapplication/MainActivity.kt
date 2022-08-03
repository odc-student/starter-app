package tn.orange.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import tn.orange.myapplication.presentation.product.list.ProductListViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val viewmodel: ProductListViewModel = ViewModelProvider.get(ProductListViewModel::class)
        setContentView(R.layout.activity_main)

//        viewmodel.viewState.observe(this) {
//            Log.e("TAG", "onCreate: ${it.products.size}")
//        }
//
//        viewmodel.loadProducts()
    }
}