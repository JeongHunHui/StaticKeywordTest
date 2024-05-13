package com.example.statictest.domain

data class FruitClass (
    val koreanName: String,
    val price: Int,
    val description: String
) {
    companion object {
        val APPLE = FruitClass("사과", 1000, "붉고 맛있는 과일")
        val BANANA = FruitClass("바나나", 1500, "길고 노란 열대 과일")
        val CHERRY = FruitClass("체리", 2000, "작고 달콤한 빨간 과일")
        val GRAPE = FruitClass("포도", 3000, "다수의 작은 과일이 한송이에 달려있는 과일")
        val ORANGE = FruitClass("오렌지", 2500, "비타민 C가 풍부한 주황색 과일")
    }
}