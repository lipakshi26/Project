import Array._
    object Print_concat{
	def main(args:Array[String]):Unit={
	var arr=Array("Hi","Hello","Hey")
	
	for(a<-arr)
	{
	  println(a)
	  
	}
	var arr1=Array(1,2,3)
	var arr2=Array(3,4,5)
	//println("Second element changed")
      var arr3= concat(arr1,arr2)
      for(c<-arr3)
      {
      	println(c)
      }

	
	}
}