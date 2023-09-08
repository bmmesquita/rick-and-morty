package dev.bmesquita.domain

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object CharactersListDomainModule {

    @Provides
    @ViewModelScoped
    fun provideGetCharactersUseCase(repository: ApplicationRepository): GetCharactersUseCase {
        return GetCharactersUseCase(repository)
    }

}