package core

import androidx.compose.runtime.MutableState

import data.AnswerOption

interface Quiz {
    val currentQuizId: MutableState<Int>
    val currentQuizNumber: MutableState<Int>
    fun onClickNext(answerOption: AnswerOption)
    fun getAnswerOptions(): List<AnswerOption>
    fun getQuestionText(): String
    fun reset()
}