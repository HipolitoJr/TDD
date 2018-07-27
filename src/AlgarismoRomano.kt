enum class Romano(var valorInteiro: Int) {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);
}

class AlgarismoRomano(var romanos: List<Romano>?) {

    fun getValorEmInteiro(position: Int): Int {
        return this.romanos!!.get(position).valorInteiro
    }

    fun converterParaInteiro(): Int{
        if (this.romanos!!.size == 1)
            return this.getValorEmInteiro(0)
        else{
            var qtd = 0

            for (romano in this.romanos!!) {
                qtd += romano.valorInteiro
            }

            return qtd
        }
    }

}