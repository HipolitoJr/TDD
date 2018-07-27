import org.junit.Assert
import org.junit.Test

class TestaConversor {

    @Test
    fun deveConverterDeNumeroRomanoSimplesParaInteiroSimples(){
        var numeros: MutableList<Romano> = mutableListOf(Romano.X)
        var algarismos: List<Romano> = numeros

        var romano = AlgarismoRomano(algarismos)

        Assert.assertEquals(10, romano.converterParaInteiro())
    }

    @Test
    fun deveConverterDeNumeroRomanoDuploParaInteiro(){
        var numeros: MutableList<Romano> = mutableListOf(Romano.X, Romano.X)
        var algarismos: List<Romano> = numeros

        var romano = AlgarismoRomano(algarismos)

        Assert.assertEquals(20, romano.converterParaInteiro())
    }

}