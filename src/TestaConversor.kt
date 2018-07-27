import org.junit.Assert
import org.junit.Test

class TestaConversor {

    @Test
    fun deveConverterDeNumeroRomanoSimplesParaInteiroSimples(): Unit{
        var numeros: MutableList<Romano> = mutableListOf(Romano.X)
        var algarismos: List<Romano> = numeros

        var romano = AlgarismoRomano(algarismos)

        Assert.assertEquals(10, romano.converterParaInteiro())
    }

}