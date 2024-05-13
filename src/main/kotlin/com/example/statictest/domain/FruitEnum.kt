package com.example.statictest.domain

enum class FruitEnum(
    private val koreanName: String,
    private val price: Int,
    private val description: String
) {
    APPLE("사과", 1000, "붉고 맛있는 과일"),
    BANANA("바나나", 1500, "길고 노란 열대 과일"),
    CHERRY("체리", 2000, "작고 달콤한 빨간 과일"),
    GRAPE("포도", 3000, "다수의 작은 과일이 한송이에 달려있는 과일"),
    ORANGE("오렌지", 2500, "비타민 C가 풍부한 주황색 과일")
    ;
}