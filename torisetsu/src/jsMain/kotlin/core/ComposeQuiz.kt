package core

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.MutableState
import data.AnswerOption
import data.Question
import kotlinx.browser.window

class ComposeQuiz : Quiz {
    // TODO: Load file
    private val questions: List<Question> = listOf(
        Question(
            id = 0,
            questionText = "あなたの情報収集はどこから？",
            answerOptions = listOf(
                AnswerOption("インターネットから！", 1, false),
                AnswerOption("コードから！", 2, false),
                AnswerOption("本から！", 3, false),
                AnswerOption("オフラインから！", 3, false),
            ),
        ),
        Question(
            id = 1,
            questionText = "一番好きなインターネットは？",
            answerOptions = listOf(
                AnswerOption("SNS", 5, false),
                AnswerOption("Reddit", 6, false),
                AnswerOption("GitHub", 2, false),
                AnswerOption("その他", 6, false),
            ),
        ),
        Question(
            id = 2,
            questionText = "好きなエディタは？",
            answerOptions = listOf(
                AnswerOption("VSCode", 7, false),
                AnswerOption("Emacs", 9, false),
                AnswerOption("vim", 9, false),
                AnswerOption("IntelliJ", 8, false),
                AnswerOption("その他", 7, false),
            ),
        ),
        Question(
            id = 3,
            questionText = "普段は何を開発している？",
            answerOptions = listOf(
                AnswerOption("iOS", 10, false),
                AnswerOption("Android", 11, false),
                AnswerOption("Web", 9, false),
                AnswerOption("その他", 9, false),
            ),
        ),
        Question(
            id = 4,
            questionText = "Kotlinを学び始めた理由は？",
            answerOptions = listOf(
                AnswerOption("過去のKotlinFestから！", 12, false),
                AnswerOption("アプリ開発がやりたくて", 11, false),
                AnswerOption("ちょうど流行ってて", 13, false),
                AnswerOption("その他", 14, false),
            ),
        ),
        Question(
            id = 5,
            questionText = "ついついやってしまうものと言えば？",
            answerOptions = listOf(
                AnswerOption("X（旧Twitter）", 0, true),
                AnswerOption("口笛", 16, false),
                AnswerOption("IntelliJのカスタムインスペクションを弄る", 8, false),
                AnswerOption("プログラミング", 6, false),
            ),
        ),
        Question(
            id = 6,
            questionText = "よく使うKotlinのバージョンは？",
            answerOptions = listOf(
                AnswerOption("2.0.20-Beta1", 13, false),
                AnswerOption("2.0.0", 13, false),
                AnswerOption("1系", 2, false),
                AnswerOption("0.x.x", 2, false),
            ),
        ),
        Question(
            id = 7,
            questionText = "プロジェクトの依存関係管理といえば？",
            answerOptions = listOf(
                AnswerOption("Gradle", 11, false),
                AnswerOption("Maven", 11, false),
                AnswerOption("SBT", 11, false),
                AnswerOption("その他", 11, false),
            ),
        ),
        Question(
            id = 8,
            questionText = "Kotlinのお気に入り機能は？",
            answerOptions = listOf(
                AnswerOption("コルーチン", 14, false),
                AnswerOption("拡張関数", 7, false),
                AnswerOption("単一式関数", 7, false),
                AnswerOption("Null安全性", 11, false),
                AnswerOption("その他", 11, false),
            ),
        ),
        Question(
            id = 9,
            questionText = "開発で大事にしていることは？",
            answerOptions = listOf(
                AnswerOption("チーム", 16, false),
                AnswerOption("品質", 8, false),
                AnswerOption("事業価値", 8, false),
                AnswerOption("スピード", 17, false),
                AnswerOption("デザインパターン", 18, false),
            ),
        ),
        Question(
            id = 10,
            questionText = "好きな言語はもちろん？",
            answerOptions = listOf(
                AnswerOption("Dart", 1, true),
                AnswerOption("Swift", 2, true),
                AnswerOption("Kotlin", 19, false),
                AnswerOption("その他", 20, false),
            ),
        ),
        Question(
            id = 11,
            questionText = "このコードの実行結果は？",
            answerOptions = listOf(
                AnswerOption("正解", 21, false),
                AnswerOption("不正解", 10, false),
                AnswerOption("惜しい！", 18, false),
            ),
        ),
        Question(
            id = 12,
            questionText = "勉強会やカンファレンスの参加は何回目？",
            answerOptions = listOf(
                AnswerOption("今日がはじめて！", 6, false),
                AnswerOption("2~3回くらい", 13, false),
                AnswerOption("5回は超えてる", 16, false),
                AnswerOption("10回は超えてる!", 16, false),
            ),
        ),
        Question(
            id = 13,
            questionText = "勉強会やカンファレンスの参加は何回目？",
            answerOptions = listOf(
                AnswerOption("ペンギンのペン銀ｗｗｗ！", 3, true),
                AnswerOption("ツバメが椅子にスワローｗｗｗ", 11, false),
                AnswerOption("私のトリ柄はトリリンガルｗｗｗ!", 11, false),
            ),
        ),
        Question(
            id = 14,
            questionText = "好きなIntelliJ IDEA pluginは？",
            answerOptions = listOf(
                AnswerOption("Rainbow Brackets", 11, false),
                AnswerOption("Awesome Console", 22, false),
                AnswerOption("Git ToolBox", 17, false),
                AnswerOption("その他", 11, false),
            ),
        ),
        Question(
            id = 15,
            questionText = "KotlinFest中に障害アラートが鳴っている！どうする？",
            answerOptions = listOf(
                AnswerOption("大急ぎでログを見に行く", 12, false),
                AnswerOption("対策はバッチリ!様子を見る", 24, false),
                AnswerOption("神に祈る", 17, false),
                AnswerOption("その他", 11, false),
            ),
        ),
        Question(
            id = 16,
            questionText = "テックイベントの懇親会といえば？",
            answerOptions = listOf(
                AnswerOption("お酒とお笑い", 4, true),
                AnswerOption("深く熱い技術トーク", 21, false),
                AnswerOption("出会いと再会", 13, false),
            ),
        ),
        Question(
            id = 17,
            questionText = "あなたのトリ柄は？（取り柄）",
            answerOptions = listOf(
                AnswerOption("圧倒的開発スピード", 22, false),
                AnswerOption("こだわりの品質", 5, true),
                AnswerOption("アプリ開発経験", 2, true),
            ),
        ),
        Question(
            id = 18,
            questionText = "Kotlinのシングルトンパターンをどのように実装しますか？",
            answerOptions = listOf(
                AnswerOption("objectキーワードを使う", 17, false),
                AnswerOption("インスタンスを手動管理", 24, false),
                AnswerOption("他のデザインパターンを使う", 20, false),
            ),
        ),
        Question(
            id = 19,
            questionText = "Kotlin Multiplatformをつかったことは？",
            answerOptions = listOf(
                AnswerOption("あるある", 25, false),
                AnswerOption("ないない", 20, false),
            ),
        ),
        Question(
            id = 20,
            questionText = "人生初のプログラミングは？",
            answerOptions = listOf(
                AnswerOption("アプリ開発したよ", 2, true),
                AnswerOption("独学だよ", 6, true),
                AnswerOption("C言語なのに", 6, true),
                AnswerOption("大学の授業でやったよ", 6, true),
                AnswerOption("その他", 5, true),
            ),
        ),
        Question(
            id = 21,
            questionText = "Kotlinでのエラーハンドリングの方法でよく使うのは？",
            answerOptions = listOf(
                AnswerOption("カスタムエラー型", 23, false),
                AnswerOption("Either使っておけばいいざぁ", 23, false),
                AnswerOption("runCatching", 10, false),
                AnswerOption("Try-catch", 6, false),
            ),
        ),
        Question(
            id = 22,
            questionText = "Kotlinで非同期処理はどう実装する？",
            answerOptions = listOf(
                AnswerOption("コルーチン", 7, true),
                AnswerOption("RxKotlin", 7, true),
                AnswerOption("JavaのFutureやCompletableFuture", 7, true),
                AnswerOption("C言語なのに", 7, true),
            ),
        ),
        Question(
            id = 23,
            questionText = "ストレスを感じた時にどうする？",
            answerOptions = listOf(
                AnswerOption("時が過ぎるまで待つ", 24, false),
                AnswerOption("気分転換する", 8, true),
                AnswerOption("相談する", 11, false),
            ),
        ),
        Question(
            id = 24,
            questionText = "鳴かぬなら、どうしてみせようホトトギス？",
            answerOptions = listOf(
                AnswerOption("泣かせてみせよう", 8, true),
                AnswerOption("泣くまで待とう", 9, true),
                AnswerOption("そういう種類だ", 25, false),
            ),
        ),
        Question(
            id = 25,
            questionText = "好きなフレームワークは？",
            answerOptions = listOf(
                AnswerOption("wasabi", 3, true),
                AnswerOption("Spring Boot", 20, false),
                AnswerOption("Ktor", 20, false),
                AnswerOption("Flutter", 25, true),
            ),
        ),
    )
    private val results: List<String> = listOf(
        "/aoitori.html",
        "/aoitori.html",
        "/aoitori.html",
        "/aoitori.html"
    )
    override val currentQuizId: MutableState<Int> = mutableStateOf(0)
    override val currentQuizNumber: MutableState<Int> = mutableStateOf(1)

    override fun onClickNext(answerOption: AnswerOption) {
        if (answerOption.isFinish) {
            window.location.pathname = results[answerOption.nextId]
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
