enum class Romano{
    I,
    V,
    X,
    L,
    C,
    D,
    M
}

class AlgarismoRomano(
        var numero: List<Romano>?
) {

    fun getValorEmInteiro(): Int{
        when (this.numero){
            Romano.I -> return 1
            Romano.V -> return 5
            Romano.X -> return 10
            Romano.L -> return 50
            Romano.C -> return 100
            Romano.D -> return 500
            Romano.M -> return 1000

            else -> return -1
        }
    }

    fun converterParaInteiro(): Int{
        if (this.numero!!.size == 1)
            return this.converterParaInteiro()
        else
            //TODO:Implementar retorno para mais de 1 algarismo no numero
            return 0
    }

}