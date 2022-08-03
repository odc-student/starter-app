package tn.orange.myapplication

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var title: String

    @Before
    fun setUp() {
        title = "tester"
    }

    @Test
    fun `When SendReportUseCase is executed return boolean`() {
        Assert.assertEquals("tester", title)
    }
}