package FactoryMethodPattern.Kotlin.Framework

import FactoryMethodPattern.Kotlin.Concrete.FullTimeRider
import FactoryMethodPattern.Kotlin.Concrete.HalfTimeRider
import FactoryMethodPattern.Kotlin.Concrete.NightTimeRider
import java.time.LocalTime

class RiderCreator {

    fun createRider(jobType: String): Rider {

        return when (jobType) {
            "FullTime" -> FullTimeRider()
            "HalfTime" -> HalfTimeRider()
            "NightTime" ->
                if (LocalTime.now().hour > 21)
                    NightTimeRider()
                else
                    throw IllegalArgumentException("오후 9시 이후만 생성 가능합니다")

            else -> {
                throw IllegalArgumentException("생성할 수 있는 객체명이 아닙니다.")
            }
        }
    }
}