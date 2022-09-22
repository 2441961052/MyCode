package com.fenrir.dagger2_kotlin.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
class NetModule {

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("http://www.google.com")
            .build()
    }
    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }
    @Singleton
    @Provides
    fun provideOkhttpClient():OkHttpClient{
        return OkHttpClient.Builder()
            .build()
    }

}