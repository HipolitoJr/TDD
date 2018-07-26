import org.junit.Assert
import org.junit.Test

class TestaConversor {

    @Test
    fun deveConverterDeNumeroRomanoParaInteiro(): Unit{
        var numeros: MutableList<Romano> = mutableListOf(Romano.I)
        var algarismos: List<Romano> = numeros

        var romano = AlgarismoRomano(algarismos)

        Assert.assertEquals(1, romano.converterParaInteiro())
    }

}