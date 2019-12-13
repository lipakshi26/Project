class SingleArray{
	var arr=Array(1,2,3,4,5,6)
	def show():Unit={
	for (a<-arr)
	println(a)
	}
}
object Arrayy{
	def main(args:Array[String]):Unit={
	var a = new SingleArray()
	a.show()
}
}