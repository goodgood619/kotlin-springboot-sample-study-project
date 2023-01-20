package com.group.libraryapp.util

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

fun fail(): Nothing {
    throw IllegalArgumentException()
}

// custom 확장 함수 예제 (ex) CrudRepository 근데 이것도 찾아 들어가 보면 확장 함수임, findbyIdOrNull ㅋㅋ)
fun <T, ID> CrudRepository<T, ID>.findByIdOrThrow(id: ID): T {
    return this.findByIdOrNull(id) ?: fail()
}