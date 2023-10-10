package com.statement.domain.repositories

import com.statement.domain.entities.Statement

interface StatementRepository {
    fun findByIdUsuario(idUsuario: Int): List<Statement>
}