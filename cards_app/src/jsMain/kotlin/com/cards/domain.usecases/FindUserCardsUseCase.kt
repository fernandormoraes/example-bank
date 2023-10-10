package com.cards.domain.usecases

import com.cards.domain.entities.Card
import com.cards.domain.repositories.CardsRepository

class FindUserCardsUseCase (private val cardsRepository: CardsRepository){
    suspend fun run(params: FindUserCardsUseCaseParams) : List<Card>{
        return cardsRepository.findByIdUsuario(params.idUser);
    }
}

final class FindUserCardsUseCaseParams (val idUser: Int){}