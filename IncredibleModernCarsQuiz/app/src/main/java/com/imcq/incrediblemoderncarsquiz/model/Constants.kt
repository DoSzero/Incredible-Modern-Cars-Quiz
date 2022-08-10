package com.imcq.incrediblemoderncarsquiz.model

import com.imcq.incrediblemoderncarsquiz.R


object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "как называется этот кроссовер от компании Skoda?",
            R.drawable.image_1,
            "Это Karoq",
            "Это Kamiq",
            "Это Kushaq",
            "Это Kusqr",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "как называется этот  электрический кроссовер от компании Skoda?",
            R.drawable.image_2,
            "Е-Karoq",
            "Nasdaq EV",
            "Enyaq iV",
            "Е-CarEV",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Имя этого семиместного кроссовера под брендом Dacia ?",
            R.drawable.image_3,
            "Jogger",
            "Bigster",
            "Trailster",
            "Longer",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Как называется этот Nissan? Новинка на фото адресована рынку Индии",
            R.drawable.image_4,
            "Juke",
            "Terra",
            "Готэм",
            "Magnite",
            4
        )
        questionsList.add(que4)


        val que5 = Question(
            5, "В этом году Hyundai показал удлинённый мини-вседорожник, похожий на Крету. Какое имя он получил?",
            R.drawable.image_5,
            "Creta+",
            "Alcazar",
            "Bacalar",
            "El-car",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Hyundai недавно выкатили по-настоящему маленькую новинку. Какое имя новинки ??",
            R.drawable.image_6,
            "Casper",
            "Bayon",
            "IX10",
            "Sonata",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Модельная гамма бренда Volkswagen знатно расширилась с появлением электрических новинок серии ID. А какой из «АйДи» мы вам показываем?",
            R.drawable.image_7,
            "ID.Buzz",
            "ID.3",
            "ID.4",
            "ID.Sota",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "У китайского бренда Chery тоже много моделей с цифрами. А ещё — с приставками Pro. Как называется ?",
            R.drawable.image_8,
            "Tiggo 5",
            "Tiggo 7 Pro",
            "Tiggo 8 Pro",
            "Tiggo 2 Pro",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Бренд GAC из Гуанчжоу известен, благодаря вседорожнику GS8. Это он?",
            R.drawable.image_9,
            "Да, это GS8",
            "Нет, это GS5",
            "Это GN6",
            "Это GN4",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Продажи Subaru электрической новинки стартуют в 2022 году. Но имя кроссовера уже давно не тайна ",
            R.drawable.image_10,
            "Tavascan",
            "Xterra",
            "Solterra",
            "E-Sport",
            3
        )
        questionsList.add(que10)

        return questionsList
    }
}