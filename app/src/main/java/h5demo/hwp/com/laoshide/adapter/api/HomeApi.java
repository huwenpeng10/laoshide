package h5demo.hwp.com.laoshide.adapter.api;


import h5demo.hwp.com.laoshide.bean.LiveBean;
import okhttp3.FormBody;

/**
 * Created by xiaoyuan on 17/3/10.
 */

public interface HomeApi {
    @POST(UrlConfig.LIVE_HOME)
    Call<LiveBean> get_live(@Body FormBody body);
}
