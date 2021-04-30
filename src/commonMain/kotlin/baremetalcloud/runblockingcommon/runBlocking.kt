package baremetalcloud.runblockingcommon

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

expect val testCoroutineContext: CoroutineContext

expect fun runBlockingCommon(block: suspend CoroutineScope.()-> Unit)
