import org.junit.jupiter.api.Assertions.* // Mengimpor fungsi-fungsi yang diperlukan dari JUnit Jupiter
import kotlin.test.Test // Mengimpor anotasi @Test dari paket kotlin.test
import kotlin.test.assertEquals // Mengimpor fungsi assertEquals dari paket kotlin.test

internal class SampleTest { // Mendefinisikan kelas SampleTest sebagai kelas pengujian internal
    
    // Membuat instance dari kelas Sample untuk pengujian
    private val testSample: Sample = Sample() 

    // Menandai bahwa ini adalah metode pengujian
    @Test
    fun testSum(){ 

        val expected = 86 // Mendefinisikan hasil yang diharapkan

        // Memanggil metode sum dengan argumen 82 dan 4, kemudian membandingkan hasilnya dengan yang diharapkan
        assertEquals(expected, testSample.sum(82, 4)) 
    }
}

