package com.jaysinghtalreja.cinepop.di.modules

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

/**
 * Created by JaySinghTalreja
 */
@Module
@InstallIn(SingletonComponent::class)
object PreferenceModule {
    @Provides
    fun provideSharedPreference(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("cinepop_pref", Context.MODE_PRIVATE)
    }
}