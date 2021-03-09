package com.sj.bmicalculator.di

import android.content.Context
import com.sj.bmicalculator.BaseActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Appmodule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app : Context): BaseActivity{
        return app as BaseActivity
    }
}