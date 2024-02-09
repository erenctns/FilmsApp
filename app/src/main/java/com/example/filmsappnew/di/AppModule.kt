package com.example.filmsappnew.di

import com.example.filmsappnew.data.datasource.FilmlerDataSource
import com.example.filmsappnew.data.repo.FilmlerRepository
import com.google.firebase.Firebase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton // bu singleton yapısı tek bir nesne oluşturup birsürü yerde kullanmamızı sağlıyor
    fun provideFilmlerDataSource(collectionFilmler:CollectionReference):FilmlerDataSource{
        return FilmlerDataSource(collectionFilmler)
    }
    @Provides
    @Singleton
    fun provideFilmlerRepository(fds:FilmlerDataSource):FilmlerRepository{
        return FilmlerRepository(fds)
    }
    //Burda en son tabloma erişiyorum firebasedeki
    @Provides
    @Singleton
    fun provideFilmlerCollectionReference():CollectionReference{
        return Firebase.firestore.collection("Filmler")
    }

}