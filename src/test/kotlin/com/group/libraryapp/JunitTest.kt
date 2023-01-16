package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {


    companion object {

        @BeforeAll
        @JvmStatic
        fun beforeAll() {

        }

        @AfterAll
        @JvmStatic
        fun afterAll() {

        }
    }
    @BeforeEach
    fun beforeEach() {

    }

    @AfterEach
    fun afterEach() {

    }

    @Test
    fun test1() {
        println("테스트 1")
    }
}