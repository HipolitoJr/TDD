import java.text.FieldPosition

enum class Romano(var i: Int) {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);
}

class AlgarismoRomano(var numeros: List<Romano>?) {

    fun getValorEmInteiro(position: Int): Int {
        return this.numeros!!.get(position).i
    }

    fun converterParaInteiro(): Int{
        if (this.numeros!!.size == 1)
            return this.getValorEmInteiro(0)
        else{
            var qtd = 0

            for (romano in this.numeros!!) {
                qtd += romano.i
            }

            return qtd
        }
    }

}