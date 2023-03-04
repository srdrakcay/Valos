package com.serdar.data.mapper

interface ValorantMapper<I, O> {
    fun map(input: I?): O
}