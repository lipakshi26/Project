import scala.collection.immutable.Stream.cons 
object Streams{
	def main(args:Array[String]):Unit={
		val stream = 91 #:: 22#:: 78#:: 87#:: 79 #:: Stream.empty
		println(stream)
		println("Print first 3 elements  ")
		stream.take(3).print
		println("Print first elements  ")
        stream.take(6).print
	}
}


