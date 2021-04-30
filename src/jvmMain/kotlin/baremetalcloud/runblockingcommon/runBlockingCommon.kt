package baremetalcloud.runblockingcommon

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors
import kotlin.coroutines.CoroutineContext

actual val testCoroutineContext: CoroutineContext =
    Executors.newSingleThreadExecutor().asCoroutineDispatcher()
actual fun runBlockingCommon(block: suspend CoroutineScope.() -> Unit) =
    kotlinx.coroutines.runBlocking(testCoroutineContext) { this.block() }