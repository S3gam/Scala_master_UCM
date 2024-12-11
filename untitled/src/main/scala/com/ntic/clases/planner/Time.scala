package com.ntic.clases.planner

class Time (val hours: Int = 0, val minutes: Int = 0) {
  val asMinutes = (hours * 60) + minutes
  def minus(that: Time) : Int = this.asMinutes - that.asMinutes //this = self. se refiere al mismo objeto sobre el que se aplica
  def - (that: Time): Int = minus(that)
  require(hours >= 0 && hours <= 23, "Las horas deben estar entre 0 y 23") //La función require está disponible en toda aplicación de scala
  require(minutes >= 0 && minutes <= 60, "los minutos deben estar entre 0 y 60")
}

object Time {
  def fromMinutes(minutes:Int) : Time = {
    val h = minutes/60 //la division entre enteros da resultado entero, si hay un double da resultado double
    val min = minutes % 60
    new Time(hours = h, minutes = min)
  }
}