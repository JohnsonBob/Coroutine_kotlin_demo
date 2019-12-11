package com.johnson.coroutine_kotlin_demo.utils

/**
 * Created by ${zml} on 2018/1/24.
 */
object Global {

    var DELAY_MONITOR = 3600000
    var DELAY_RESET = 3000
    var DOWNLOADCLEANCACHE = 60 * 60 * 1000 //60分钟清除一次缓存

    //定时连接服务器得时间
    var DELAY_SERVICE_TIME = 3000

    //周期性同步服务器时间
    var DELAY_NTP = 1 * 60 * 60 * 1000 //1小时同步一次

    //启动页跳转主页面时间
    var DELAY_SPLASH = 5000

    var DELAY_NET = 5000

    //和服务器交互消息message_type定义
    val MSG_NULL_PLAY_REQ = 864//暂无节目
    val MSG_FREE_PLAY_REQ = 865//空闲播放
    val MSG_TIME_PLAY_REQ = 867//按时播放
    val MSG_INTERVAL_PLAY_REQ = 869//插播播放
    val MSG_PROGRAM_UNDO = 871//撤消节目
    val MSG_DEVICE_REBOOT = 873//重启设备
    val MSG_STATE_REPORT = 875//上报状态(CP),MEERO,D等
    val MSG_ID_SET_SERVER_ADDRESS = 885 //配置服务器地址
    val MSG_ID_IDS2_DEVICE_REBOOT_TIMER = 889 //定时重启任务
    val MSG_ID_IDS2_DEVICE_REBOOT_TIMER_UNDO = 891 //定时重启任务撤销
    val MSG_ID_IDS2_DEVICE_SCREEN_ON = 899 //屏幕亮屏指令
    val MSG_ID_IDS2_DEVICE_SCREEN_OFF = 897 //屏幕息屏指令
    val MSG_ID_IDS2_DEVICE_UPDATE_VERSION = 901 //版本更新
    val MSG_ID_IDS2_DEVICE_SEND_MODE = 902 //前端设置终端逻辑
    val MSG_ID_IDS2_DEVICE_CLEAR_CACHE = 905 //清除终端离线缓存逻辑
    val MSG_ID_IDS2_DEVICE_PLAY_AUDIO = 906 //播放背景音乐
    val MSG_ID_IDS2_DEVICE_STOP_AUDIO = 907 //停止背景音乐

    //会议节目
    val MSG_ID_IDS2_MEETING_PLAY_REQ = 893//会议节目
    val MSG_ID_IDS2_MEETING_UNDO = 895
    val MSG_ID_IDS2_CHANGE_MEETING_ROOM = 904 //设备更换了会议室
    val MSG_ID_IDS2_MEETING_UPDATE_MODE = 903 //修改会议模板的协议

    var MSG_DEVICE_REGISTER = 882

    val MSG_ID_IDS2_DOC_PROGRAM_FINISHED = 910 //pdf文档播放结束
    val MSG_ID_IDS2_STORAGE_LIMITATION = 911 //存储空间不足
    val MSG_ID_IDS2_TRIGGER_DOWNLOAD_RESUME = 912
    val MSG_ID_IDS2_TRIGGER_DOWNLOAD_COMPLETE = 913
    val MSG_ID_IDS2_TRIGGER_RESET_CURRENT_PROGRAM = 914

    //会务模板
    val MSG_MEETING_ROOM_EDIT = 883    //883   会议室信息修改（含开放时间和禁用时间）
    val MSG_MEETING_ROOM_BIND = 903    //903   会议室模板绑定（含开放时间和禁用时间）
    val MSG_MEETING_ROOM_ASSETS_EDIT = 904     //904   修改资产绑定

    val MSG_MEETING_CREATE = 1001     //1001  预约会议
    val MSG_MEETING_EDIT = 1002     //1002  修改会议
    val MSG_MEETING_END = 1003     //1003  结束会议
    val MSG_MEETING_DISMISS = 1004     //1004  取消会议
    val MSG_MEETING_SIGN_SUCCESS = 1005     //1005  签到成功推送

    val MSG_MEETING_UPDATE_FACE = 701     //701新增或修改人脸信息
    val MSG_MEETING_DELETE_FACE = 702     //702 删除人脸信息


    val MEETINGINFO = "meetingInfo"
    val FACEACCURACY = "FaceAccuracy"       //人脸准确性


    //上报警报状态
    var ALARM_NOAMAL = 0
    var ALARM_CPU = 1
    var ALARM_MEMORY = 2
    var ALARM_both = 3
    var ALARM_sign = 4

    //在线还是离线节目标识
    var online = 1
    var offline = 0


    //用于区分当前是结束节目还是开始节目
    var PROGRAM_START = 0
    var PROGRAM_END = 1


    //服务器地址
    // public static String SERVICE_IP = "121.8.211.140";
    // public static String SERVICE_IP = "10.234.88.100";//太仓的安装包
    //public static String SERVICE_IP = "192.168.33.228";//梵华的安装包
    // public static String SERVICE_IP = "10.10.20.231";//梵华本地得包
    // public static String SERVICE_IP = "10.10.20.240";//公司本地测试地址
    //  public static String SERVICE_IP = "192.168.43.50";//上海演示项目地址
    //    public static String SERVICE_IP = "10.10.20.240";//公司本地测试地址
    // public static String SERVICE_IP = "121.8.211.140";//公网演示环境
    //public static String SERVICE_IP = "172.16.38.3";//洛阳项目
    //public static String SERVICE_IP = "10.10.14.101";//桓通通知项目
    //public static String SERVICE_IP = "10.168.31.5";//南京小学
    //  public static String SERVICE_IP = "192.168.2.150";//展会
    // public static String SERVICE_IP = "192.168.10.100";//桓通演示包
    // public static String SERVICE_IP = "192.168.4.2";//莱西二中
    //public static String SERVICE_IP = "192.168.3.10";//四川成都税务局
    // public static String SERVICE_IP = "192.168.10.126";//工厂交付项目
    // public static String SERVICE_IP = "172.16.16.187";//广州吴工演示项目
    //  public static String SERVICE_IP = "192.168.1.240";//工厂演示
    //public static String SERVICE_IP = "192.168.10.100";//工厂定版
    var SERVICE_IP = "192.168.3.136"//江苏银行南通分行项目


    //24小时的毫秒 86400000
    var zeros = 24 * 60 * 60 * 1000


    //判断节目类型
    var WHEELTYPE = 1 //快速发布得节目类型


    var PROGRAM_ACTION_INDICATION = "com.ids.program.action"
    var PROGRAM_PAUSE_INDICATION = "com.ids.program.pause"
    var PROGRAM_STOP_INDICATION = "com.ids.program.stop"
    var PROGRAM_DOC_ACTION_INDICATION = "com.ids.doc.action"
    var PROGRAM_DOC_DONE_INDICATION = "com.ids.doc.done"


    //区分当前播放的是否h5节目或 rtsp节目
    var PLAYTYPENOR = 1
    var PLAYTYPERTSP = 2

    //会议模板使用地址
    var meetingHost = "10.10.20.240:9024"


    //人脸识别
    var APP_ID = "DvuS2T7Z6gPg5NZo3BhgpLY7BoqShjh2zHcNEgjDsSic"
    var SDK_KEY = "J5fysjQeLv9ko5jwrs8q5VSz4HYgMSA7gJ1x88eJqaMb"

}
