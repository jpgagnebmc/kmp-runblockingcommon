package baremetalcloud.runblockingcommon

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlin.coroutines.CoroutineContext

val testScope = MainScope()

actual val testCoroutineContext: CoroutineContext = testScope.coroutineContext

actual fun runBlockingCommon(block: suspend CoroutineScope.() -> Unit) = kotlinx.coroutines.runBlocking { this.block() }