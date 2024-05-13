package com.example.statictest.controller

import com.example.statictest.controller.StaticTestController.Companion.fruitClasses
import com.example.statictest.controller.StaticTestController.Companion.fruitEnums
import com.example.statictest.domain.FruitClass
import com.example.statictest.domain.FruitEnum
import org.springframework.web.bind.annotation.*

@RestController
class StaticTestController {
    companion object {
        val fruitClasses = arrayListOf<FruitClass>()
        val fruitEnums = arrayListOf<FruitEnum>()
    }

    @GetMapping("/fruitClass")
    fun saveFruitClass() {
        for (i in 0..2) {
            fruitClasses.add(FruitClass.APPLE)
            fruitClasses.add(FruitClass.BANANA)
            fruitClasses.add(FruitClass.CHERRY)
            fruitClasses.add(FruitClass.GRAPE)
            fruitClasses.add(FruitClass.ORANGE)
        }
    }

    @GetMapping("/nonStaticFruitClass")
    fun saveNonStaticFruitClass() {
        for (i in 0..2) {
            fruitClasses.add(FruitClass("사과", 1000, "붉고 맛있는 과일"))
            fruitClasses.add(FruitClass("바나나", 1500, "길고 노란 열대 과일"))
            fruitClasses.add(FruitClass("체리", 2000, "작고 달콤한 빨간 과일"))
            fruitClasses.add(FruitClass("포도", 3000, "다수의 작은 과일이 한송이에 달려있는 과일"))
            fruitClasses.add(FruitClass("오렌지", 2500, "비타민 C가 풍부한 주황색 과일"))
        }
    }

    @GetMapping("/fruitEnum")
    fun saveFruitEnum() {
        for (i in 0..2) {
            fruitEnums.add(FruitEnum.APPLE)
            fruitEnums.add(FruitEnum.BANANA)
            fruitEnums.add(FruitEnum.CHERRY)
            fruitEnums.add(FruitEnum.GRAPE)
            fruitEnums.add(FruitEnum.ORANGE)
        }
    }

    @GetMapping("/fruitClasses")
    fun getFruitClasses() = fruitClasses

    @GetMapping("/fruitEnums")
    fun getFruitEnums() = fruitEnums
}