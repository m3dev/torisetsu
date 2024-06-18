package core

import data.Diagnosis

class ComposeResult() : Result {
    // TODO: Load file
    private val diagnosisList: List<Diagnosis> = listOf(
        Diagnosis(
            typeText = "診断結果0です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
        Diagnosis(
            typeText = "診断結果1です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
        Diagnosis(
            typeText = "診断結果2です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
        Diagnosis(
            typeText = "診断結果3です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
    )

    override fun getDiagnosis(resultId: Int): Diagnosis {
        return diagnosisList[resultId]
    }
}