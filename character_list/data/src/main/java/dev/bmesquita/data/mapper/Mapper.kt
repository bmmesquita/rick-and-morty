package dev.bmesquita.data.mapper

import dev.bmesquita.data.remote.CharacterDto
import dev.bmesquita.domain.Character

fun CharacterDto.toCharacter(): Character {
    return Character(
        id = id,
        name = name,
        type = type,
        image = image
    )
}