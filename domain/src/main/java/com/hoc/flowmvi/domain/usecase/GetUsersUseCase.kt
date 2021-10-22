package com.hoc.flowmvi.domain.usecase

import arrow.core.Either
import com.hoc.flowmvi.domain.entity.User
import com.hoc.flowmvi.domain.repository.UserError
import com.hoc.flowmvi.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class GetUsersUseCase(private val userRepository: UserRepository) {
  operator fun invoke(): Flow<Either<UserError, List<User>>> = userRepository.getUsers()
}
