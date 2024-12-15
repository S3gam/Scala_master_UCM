package com.ntic.classes.planner

case class Train(kind:String,number: Int, schedule: Seq[(Time,Station)]) {
  require(schedule.size >= 2, "Schedule debe tener 2 estaciones al menos")

  val stations: Seq[Station] = schedule.map(stop => stop._2)
}

case class Station(name:String)
