package ru.khuzintka.cashflow.di

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.khuzintka.cashflow.data.remote.repo.CurrencyRepo
import ru.khuzintka.cashflow.data.remote.repo.CurrencyRepoImpl
import ru.khuzintka.cashflow.data.remote.service.CurrencyService
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    private val timeout = 60L
    private val url = "https://www.cbr-xml-daily.ru/"

    @Provides
    fun provideOkHttp(): OkHttpClient = OkHttpClient.Builder().apply {
        connectTimeout(timeout, TimeUnit.SECONDS)
        writeTimeout(timeout, TimeUnit.SECONDS)
        readTimeout(timeout, TimeUnit.SECONDS)
    }.build()

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val gson = GsonBuilder().setLenient().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create()

        return Retrofit.Builder().apply {
            baseUrl(url)
            client(okHttpClient)
            addConverterFactory(GsonConverterFactory.create(gson))
        }.build()
    }

    @Provides
    fun provideCurrencyService(retrofit: Retrofit): CurrencyService =
        retrofit.create(CurrencyService::class.java)

    @Provides
    fun provideCurrencyRepo(service: CurrencyService): CurrencyRepo =
        CurrencyRepoImpl(service)
}