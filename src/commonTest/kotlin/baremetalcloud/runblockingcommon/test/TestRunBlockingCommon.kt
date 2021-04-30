package baremetalcloud.runblockingcommon.test

import baremetalcloud.runblockingcommon.runBlockingCommon
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlin.test.Test


class TestRunBlockingCommon : CoroutineScope by GlobalScope {
    @Test
    fun helloWorld() = runBlockingCommon {
        println("helloWorld START")
        println("helloWorld END")
    }
}
