import dev.whyoleg.ktd.Telegram
import dev.whyoleg.ktd.TelegramClientConfiguration
import dev.whyoleg.ktd.api.TdApi
import dev.whyoleg.ktd.api.authorization.authorization
import dev.whyoleg.ktd.api.authorization.getAuthorizationState
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@ExperimentalTime
suspend fun main() {
    val telegram = Telegram(
        configuration = TelegramClientConfiguration(
            maxEventsCount = 100,
            receiveTimeout = 30.seconds
        )
    )
    val client = telegram.client()
    client.authorization(TdApi.GetAuthorizationState())
}
