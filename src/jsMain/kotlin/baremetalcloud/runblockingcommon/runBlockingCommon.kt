package baremetalcloud.runblockingcommon

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

val testScope = MainScope()

actual val testCoroutineContext: CoroutineContext = testScope.coroutineContext

actual fun runBlockingCommon(block: suspend CoroutineScope.() -> Unit): dynamic = testScope.promise { this.block() }
