object convertTemp{
    def convF(t:Double):Double=t*1.8000+32.00

    def main(args:Array[String]):Unit={
        printf("%s %f %s", "Temperature of 35 Celcius is ", convF(35), " Fahrenheit.")
    }
}