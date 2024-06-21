package core

import data.Diagnosis

class ComposeResult() : Result {
    // TODO: Load file
    private val diagnosisMap: Map<String, Diagnosis> = mapOf(
        "aoitori" to
                Diagnosis(
                    typeText = "アオイトリ",
                    srcImg = "./images/aoitori.png",
                    preText = "SNSでつぶやかずにはいられない",
                    mainText = "Xに変わってしまったけど、根強いファンの残る、あのアオイトリ。「ハチドリ」と「ムジルリツグミ」をモデルにデザインされているそうです。\n\nもはや運命であり人生。\nXでシェアを必ずしてください。",
                    postText = "ネット大好きエンジニア大募集！",
                ),

        "swift_2" to
                Diagnosis(
                    typeText = "ハチドリ",
                    srcImg = "./images/swift_2.png",
                    preText = "Dart/Flutter使いか！？",
                    mainText = "毎秒約55回、最高で約80回高速ではばたき、空中で静止するホバリング飛翔を行いブンブンと飛び回ります。\n\n小型の愛くるしさと高速に飛び回る姿から、ハチドリは様々なプロダクトやプログラミング言語のロゴのモデルにされています。",
                    postText = "医療業界を飛び回るエンジニア大募集",
                ),

        "swift_1" to
                Diagnosis(
                    typeText = "ツバメ",
                    srcImg = "./images/swift_1.png",
                    preText = "圧倒的加速度！生粋のSwift使いかもしれない",
                    mainText = "ツバメのような素早い動きで、開発を加速させます！\n\nちなみに、日本で見かけるツバメはスズメ目で、ありSwiftのモデルになったとされるトリはアマツバメ目で違う仲間なんです。このイラストはスズメ目の方ですね！",
                    postText = "圧倒的加速で成長したいエンジニア大募集！",
                ),
        "penguin" to
                Diagnosis(
                    typeText = "ペンギン",
                    srcImg = "./images/penguin.png",
                    preText = "好奇心旺盛！何にでも突っ込むファーストペンギン",
                    mainText = "ペンギンといえばLinuxのTuxくん。Wikipediaの充実度が凄いので是非見て欲しいところです！\n\nファーストペンギンの方は、最初に飛び込むのは自らではなく集団に押されて。しかも危険度はかなり高く、その殆どが食べられてしまうというがあなたは果たして…",
                    postText = "先行者利益を取りに行くエンジニア大募集！",
                ),
        "kakapo" to
                Diagnosis(
                    typeText = "カカポ",
                    srcImg = "./images/kakapo.png",
                    preText = "明るく愉快に開発に向き合うエンジニア",
                    mainText = "カカポは、『Party Parott』のネットミームとして愛されているトリです。その愉快な求愛行動(Party)は見るものを世界中で虜にしてきました。人間にうっかり惚れてしまうカカポのその愛くるしさは、まさに人間性全開な開発スタイル。\n\n一方現実のカカポは絶滅危惧種であり、世界で唯一の飛べないオウム。ニュージーランドの保護施設におり、一般の方は見ることができないそう。。",
                    postText = "愉快に働くエンジニア大募集！",
                ),
        "kanaria" to
                Diagnosis(
                    typeText = "カナリア",
                    srcImg = "./images/kanaria.png",
                    preText = "慎重に慎重をかさねる",
                    mainText = "美しい鳴き声でペットとして人気の高いカナリアは、その昔、一酸化炭素や有毒ガスの濃度が高いと鳴き声が止まることを利用し、炭鉱内の有毒ガスを検出する「炭鉱のカナリア」として使われてきました。\n\nカナリアデプロイ、リリースの由来は、そうしたカナリアの歴史的背景から来ています。",
                    postText = "丁寧な仕事のエンジニア大募集！",
                ),
        "kiwi" to
                Diagnosis(
                    typeText = "キーウイ",
                    srcImg = "./images/kiwi.png",
                    preText = "Lint大好き、言語の真髄はC",
                    mainText = "Checking C Programs with Lint: C Programming UtilityのO'Reilly本の表紙のトリ！\n\nちなみにキーウィはその憎めない愛くるしい姿から多くの人びとに愛されており、ニュージランドのシンボルのトリです。",
                    postText = "シニアなエンジニアも大募集！",
                ),
        "hayabusa" to
                Diagnosis(
                    typeText = "はやぶさ",
                    srcImg = "./images/hayabusa.png",
                    preText = "実装の速さでは誰にも負けない！",
                    mainText = "名前の由来は、飛行速度の速さから「速飛翼(はやとびつばさ)、速翼(はやつばさ)」が転じて「はやぶさ」になったとされています。\n\n急降下時の最高速度は時速300キロメートル以上にも達し、世界最速の動物の一つです。",
                    postText = "爆速開発大好きエンジニア大募集！",
                ),
        "hashibirokou" to
                Diagnosis(
                    typeText = "ハシビロコウ",
                    srcImg = "./images/hashibirokou.png",
                    preText = "どんなインシデントが起きても動じず冷静に対処",
                    mainText = "ハシビロコウは、狙った獲物が現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるCoolなエンジニア。\n\nちなみに、ハシビロコウは関東では、上野動物園、千葉市動物公園で見ることができます。",
                    postText = "どんな問題にも動じないエンジニア大募集！",
                ),
        "hashibirokou_sr" to
                Diagnosis(
                    typeText = "ハシビロコウSR",
                    srcImg = "./images/hashibirokou_sr.png",
                    preText = "どんな事が起きても動じず冷静に対処",
                    mainText = "ハシビロコウは、狙った獲物が現れるまで、数時間も動きを止めることができるトリ。その動じない姿。まさかのあの有名な道着。溢れ出るオーラ。そうあなたは、スーパー最強な、頼れるCTOレベルなエンジニア。\n\nちなみに、ハシビロコウは関東では、上野動物園、千葉市動物公園で見ることができます。",
                    postText = "SSR級エンジニア大募集！",
                ),
    )

    override fun getDiagnosis(resultPathName: String): Diagnosis? {
        return diagnosisMap[resultPathName.split("/").dropLastWhile { it.isEmpty() }.last().replace(".html", "")]
    }
}
