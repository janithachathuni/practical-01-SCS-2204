object volSphere{
    def calVolume(r:Int):Double=r*r*r*math.Pi*4/3

    def main(args:Array[String]):Unit={
        printf("%s %f", "Volume of a sphere with radius 5 is ", calVolume(5))
    }
}