package com.ruiting.kanglong.net

import cn_rt.ids.net.BaseResponse
import io.reactivex.Observable
import kotlinx.coroutines.Deferred
import retrofit2.http.*


/**
 * 所有网络请求接口
 * @ClassName ApiService
 * @Description TODO
 * @Author WangShunYi
 * @Date 2019/6/22 11:18
 */
interface ApiService {

    /*//获取会议室当天的使用情况
    @GET("apps/meeting/api/v1/roomUsage/{roomid}")
    fun getRoomUsage(@Path("roomid") roomid: String, @Query("date") date: String): Observable<BaseResponse<RoomUsageBean>>

    //获取部门列表
    @GET("apps/department/api/v1/department")
    fun getDepartment(): Observable<BaseResponse<List<DepartmentBean>>>

    //根据部门id获取人员
    @GET("apps/department/api/v1/getUsers")
    fun getUsers(@Query("departmentId") departmentId: Int): Observable<BaseResponse<LinkUsersBean>>

    //预约会议
    @POST("apps/meeting/api/v1/meeting")
    fun meeting(@Body meetingJson: MeetingJson): Observable<BaseResponse<Any>>

    //获取所有会议列表--包括已经取消和完成的
    @GET("apps/meeting/api/v1/sortMeeting")
    fun getMeetingList(@Query("date") date: String): Observable<BaseResponse<List<MeetingsBean>>>

    //获取所有会议室设备列表
    @GET("apps/devices/api/v1/devices")
    fun getDevices(): Observable<BaseResponse<List<DevicesBean>>>

    //获取设备列表
    @POST("apps/devices/api/v1/device/control/{configid}")
    fun controlDevices(@Body controlJson: DeviceControlJson, @Path("configid") configId: Int): Observable<BaseResponse<Any>>

    //获取会议列表--不包括已经取消和完成的
    @GET("apps/meeting/api/v1/screen/meetingList")
    fun getMeetingList2(@Query("date") date: String,@Query("roomId") roomId: String): Observable<BaseResponse<List<MeetingsBean>>>*/

    /**
     * 获取会议列表
     */
    /*@GET("/meetingcloud/apps/meeting/api/v1/screen/meetingList")
    fun getMeetingList(@Query("roomId") roomId: String, @Query("date") date: String): Observable<BaseResponse<ArrayList<MeetingBean>>>


    //获取天气
    @GET("/meetingcloud/apps/meeting/api/v1/getWeather")
    fun getWeather(): Observable<BaseResponse<WeatherBean>>

    //获取签到生成的二维码
    @GET("/meetingcloud/apps/meeting/api/v1/meeting/getCheckinCode/{id}")
    fun getSignScanCode(@Path("id") id: Int): Observable<BaseResponse<HashMap<String, String>>>

    //获取签到人员
    @GET("/meetingcloud/apps/meeting/api/v1/meeting/getAttenders/{id}")
    fun getAttenders(@Path("id") id: Int): Observable<BaseResponse<List<AttenderBean>>>

    //获取用户人脸信息
    @GET("/meetingcloud/apps/department/api/v1/getUserFaceImages")
    fun getUserFaceImages(@Query("userId") userId: String): Observable<BaseResponse<ArrayList<UserFaceInfoBean>>>

    //获取服务器人脸识别相似度
    @GET("/meetingcloud/apps/department/api/v1/getFaceAccuracy")
    fun getFaceAccuracy(): Observable<BaseResponse<Map<String, Float>>>

    //签到接口
    @POST("/meetingcloud/apps/meeting/api/v1/uploadCheckinResult")
    fun uploadCheckinResult(@Body json: @JvmSuppressWildcards Map<String, List<MeetingSign>>): Observable<BaseResponse<Any>>
*/

    //获取天气
    @GET("/meetingcloud/apps/meeting/api/v1/getWeather")
    fun getWeatherAsync(): Deferred<BaseResponse<Any>>
}