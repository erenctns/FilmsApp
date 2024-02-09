package com.example.filmsappnew.data.repo

import androidx.lifecycle.MutableLiveData
import com.example.filmsappnew.data.datasource.FilmlerDataSource
import com.example.filmsappnew.data.entity.Filmler

class FilmlerRepository( var fds : FilmlerDataSource) {
      fun filmleriYukle(): MutableLiveData<List<Filmler>> {
       return  fds.filmleriYukle()
    }
}