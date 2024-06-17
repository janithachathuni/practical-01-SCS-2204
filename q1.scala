object areaCircle{
    def calArea(r:Int):Double=r*r*math.Pi

    def main(args:Array[String]):Unit={
        printf("%s %f", "Area of disk with radius 5 is: ", calArea(5))
    }
}