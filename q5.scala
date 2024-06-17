object runningTime{
    def easy(d:Double):Double=d*8
    
    def tempo(d:Double):Double=d*7
    
    def main(args :Array[String]):Unit={
        printf("%s %.2f","Total running time : ",easy(2) + tempo(3) + easy(2))
    }
}