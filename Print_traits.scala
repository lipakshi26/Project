trait Numbers{
	def show() :Unit
	def showcase():Unit
	}

class first extends Numbers{
	def show():Unit=
	{
		println("NUMBERS")
	}
	def showcase():Unit=
	{
		println("Alpha")
	}
}
object Print_traits{
	def main(args:Array[String]):Unit={
	var a= new first()
	a.show()
	a.showcase()

	}
}