import com.ntic.clases.planner.{Time, Train}

//new Train(number = 15)
val t1 = new Train("alto",5)
//var t2 = new Train(number = 4)

//new Train(kind: String)


println(t1)

println(t1.number)

t1.kind

val time1 = new Time(10,6)
val time2 = new Time(4,59)
time1.asMinutes

time1.minus(time2)
time1 - time2

val time3 = new Time()
println(time3)
val time4 = new Time(hours=  2)
val time5 = new Time(minutes=2)

time3.hours


val time6 = Time.fromMinutes(606)
println(time6.hours)
println(time6.minutes)

val time7 = new Time(hours=50)

