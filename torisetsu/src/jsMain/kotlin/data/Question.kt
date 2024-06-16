package data

data class Question(
    val id: Int,
    val questionText: String,
    val answerOptions: List<AnswerOption>,
)
