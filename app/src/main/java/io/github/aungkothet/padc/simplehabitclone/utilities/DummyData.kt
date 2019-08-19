package io.github.aungkothet.padc.simplehabitclone.utilities

import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.models.Topic

object DummyData {

    val dummyTopics = arrayListOf(
        Topic("Calm Nerves", "15 mins", R.drawable.selected_topic),
        Topic("Start Your Day with Gratitude", "5 mins", R.drawable.selected_topic2),
        Topic("Improve your Body Image", "15 mins", R.drawable.selected_topic3),
        Topic("Calm Nerves", "10:20 mins", R.drawable.selected_topic3),
        Topic("1 Minute Break", "15 mins", R.drawable.selected_topic4),
        Topic("Mindful Breathing", "8 mins", R.drawable.selected_topic3),
        Topic("River Ambience", "10 mins", R.drawable.selected_topic5),
        Topic("Eat More Mindfully", "15 mins", R.drawable.selected_topic2),
        Topic("Find Happiness", "15 mins", R.drawable.selected_topic4)
    )

    val selectedTopics = arrayListOf(
        "Increase Happiness", "Reduce Stress",
        "Beginner Meditation", "New on Simple Habit", "Relax Your Mind"
    )

    val images = arrayListOf(
        R.drawable.topic1, R.drawable.topic2, R.drawable.topic3,
        R.drawable.topic4, R.drawable.topic5, R.drawable.topic6, R.drawable.topic7,
        R.drawable.topic8, R.drawable.topic9, R.drawable.topic10, R.drawable.topic11,
        R.drawable.topic12, R.drawable.topic13, R.drawable.topic14, R.drawable.topic15,
        R.drawable.topic16, R.drawable.topic17
    )

    val teachers = arrayListOf(
        "Fern Dickinson",
        "Javier Philippi",
        "Guillermina Luo",
        "Eugenie Sabatino",
        "Kimberlee Demarest",
        "Alethia Klenk",
        "Herman Killian",
        "Fransisca Gulley",
        "Carman Selby",
        "Maritza Trevino",
        "Annita Lennox",
        "Marti Buss",
        "Saturnina Mattoon",
        "Desirae Milewski",
        "Ione Coulson",
        "Fe Stjacques",
        "Micki Tartt",
        "Lenard Monaco",
        "Damien Kirwin",
        "Catina Henton"
    )

}
