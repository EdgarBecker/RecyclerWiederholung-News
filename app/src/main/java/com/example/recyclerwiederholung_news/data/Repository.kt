package com.example.recyclerwiederholung_news.data

import com.example.recyclerwiederholung_news.R
import com.example.recyclerwiederholung_news.data.model.NewsArticle

class Repository {

    fun loadNews(): List<NewsArticle> {
        return listOf(
            NewsArticle(
                1,
                "Neues Hochhaus",
                R.drawable.hochhaus,
                "Deutschland",
                "30.01.2023",
                "Neues Hochhaus in Hannover!\n"

            ),
            NewsArticle(
                2,
                "Real Cast Away Story",
                R.drawable.cast_away,
                "Deutschland",
                "30.01.2023",
                "Mann 320 Tage auf einsamer Insel.  \n" +
                        "Er ernährte sich von Kokosnüssen und Flusskrebsen."

            ),

            NewsArticle(
                3,
                "Auf der Flucht! Triebtäter flüchtig und gefährlich.",
                R.drawable.ariya,
                "Deutschland",
                "30.01.2023",
                "Hinweise an die Behörde"
            ),
            NewsArticle(
                5,
                "KI auf ganz neuem Stand.",
                R.drawable.ai,
                "Welt",
                "31.01.2023",
                "Wird die Ki irgendwann ein Problem für uns Menschen?"
            )
        )
    }
}
