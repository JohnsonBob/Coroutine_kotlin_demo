package cn_rt.ids.net

/**
 * @ClassName BaseResponse
 * @Description TODO
 * @Author WangShunYi
 * @Date 2019/6/22 11:23
 */
data class BaseResponse<T> (
    val code: String,
    val message: String,
    val data: T
)