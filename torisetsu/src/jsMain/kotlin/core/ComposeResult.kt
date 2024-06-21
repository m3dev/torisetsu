package core

import data.Diagnosis

class ComposeResult() : Result {
    // TODO: Load file
    private val diagnosisMap: Map<String, Diagnosis> = mapOf(
        "aoitori" to
                Diagnosis(
            typeText = "診断結果0です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
        "aoitori2" to
                Diagnosis(
            typeText = "診断結果1です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
        "aoitori3" to
                Diagnosis(
            typeText = "診断結果2です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
        "aoitori4" to
                Diagnosis(
            typeText = "診断結果3です",
            srcImg = "./images/penguin.png",
            preText = "どんなインシデントでも冷静",
            mainText = "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。関東では、上野動物園、千葉市動物公園で見ることができます。",
            postText = "動じないエンジニア大募集！",
        ),
    )

    override fun getDiagnosis(resultPathName: String): Diagnosis? {
        return diagnosisMap.get(resultPathName.replace("/", "").replace(".html", ""))
    }
}