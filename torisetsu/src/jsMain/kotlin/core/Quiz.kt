package core

import androidx.compose.runtime.MutableState

import data.AnswerOption

interface Quiz {
    var currentQuizId: MutableState<Int>
    var currentQuizNumber: MutableState<Int>
    fun onClickNext(answerOption: AnswerOption, onClickFinish: (nextId: Int) -> Unit)
    fun getAnswerOptions(): List<AnswerOption>
    fun getQuestionText(): String
    fun reset()
}