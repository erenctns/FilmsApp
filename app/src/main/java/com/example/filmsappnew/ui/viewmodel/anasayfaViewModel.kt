package com.example.filmsappnew.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmsappnew.data.entity.Filmler
import com.example.filmsappnew.data.repo.FilmlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class anasayfaViewModel @Inject constructor (var frepo:FilmlerRepository):ViewModel() {
    var filmlerListesi = MutableLiveData<List<Filmler>>()

    //buranın amacı uyg açılır açılmaz aşağıdaki fonku çalıştırıyor ve ekranda direkt gözükmesini sağlıyor, bura olmazsa
    //ekran açıldığında direkt gözükmez
    init {
        filmleriYukle()
    }


    fun filmleriYukle(){
        filmlerListesi= frepo.filmleriYukle()
    }
}