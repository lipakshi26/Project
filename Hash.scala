import scala.collection.mutable.HashMap 
object Hash{
	def main(arg:Array[String]):Unit={

		var map=HashMap("Alina"->75, "Nidhi"->84, "Lipakshi"->70, "Ria"->50)
		println("Printing elements"+map)

		
		println("Printing with foreach loop")
		 map.foreach  
        {   
            case (key, value) => println (key + " -> " + value) 
            //println(map("A"))         
        }
          //println(map)
      //  println("Getting the value with its key")
        //println(map("R"))
        //println(map("A"))
	}
}