package com.johnson.coroutine_kotlin_demo.net


/**
 * Created by Anonymous on 17/3/10.
 */
class RxApiException(detailMessage: String) : RuntimeException(detailMessage) {

    constructor(resultCode: String, message: String) : this(getRxExceptionMessage(resultCode, message))

    companion object{
        /**
         * 对服务器传递过来的特殊信息进行特殊处理
         *
         * @param code
         * @return
         */
        private fun getRxExceptionMessage(code: String, message: String): String {
            if (code === "401") {
                //Token过期，需要重新登录
                //            EventBus.getDefault().post(new TokenLose());
            }
            return message
        }
    }
}

