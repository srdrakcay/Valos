package com.serdar.common.mapper

interface ValorantMapper<I, O> {
    fun map(input: I?): O
}