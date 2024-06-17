package core

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.MutableState
import data.AnswerOption
import data.Question

class ComposeQuiz : Quiz {
    // TODO: Load file
    private val questions: List<Question> = listOf(
        Question(
            id = 0,
            questionText = "quiz0",
            answerOptions = listOf(
                AnswerOption("1", 1, false),
                AnswerOption("2", 2, false),
                AnswerOption("3", 3, false),
            ),
        ),
        Question(
            id = 1,
            questionText = "quiz1",
            answerOptions = listOf(
                AnswerOption("0", 0, false),
                AnswerOption("2", 2, false),
                AnswerOption("3", 3, false),
            ),
        ),
        Question(
            id = 2,
            questionText = "quiz2",
            answerOptions = listOf(
                AnswerOption("0", 0, false),
                AnswerOption("1", 1, false),
                AnswerOption("3", 3, false),
            ),
        ),
        Question(
            id = 3,
            questionText = "quiz3",
            answerOptions = listOf(
                AnswerOption("0", 0, false),
                AnswerOption("1", 1, false),
                AnswerOption("2", 2, true),  // finish example
            ),
        ),
    )
    override val currentQuizId: MutableState<Int> = mutableStateOf(0)
    override val currentQuizNumber: MutableState<Int> = mutableStateOf(1)

    override fun onClickNext(answerOption: AnswerOption, onClickFinish: (nextId: Int) -> Unit) {
        if (answerOption.isFinish) {
            onClickFinish(answerOption.nextId)
        }
        currentQuizNumber.value += 1
        currentQuizId.value = answerOption.nextId
    }

    override fun getAnswerOptions(): List<AnswerOption> {
        return questions[currentQuizId.value].answerOptions
    }

    override fun getQuestionText(): String {
        return questions[currentQuizId.value].questionText
    }

    override fun reset() {
        currentQuizId.value = 0
        currentQuizNumber.value = 0
    }
}
