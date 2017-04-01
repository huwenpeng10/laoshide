package h5demo.hwp.com.laoshide.network;

import h5demo.hwp.com.laoshide.adapter.api.UrlConfig;

public class RetrofitManager {

    private static Retrofit mTestRetrofit;
    public static Retrofit getTestRetrofit() {
        if (mTestRetrofit == null) {
            synchronized (RetrofitManager.class) {
                mTestRetrofit = new Retrofit.Builder().baseUrl(UrlConfig.TestHostUrl)
                        .client(HttpClient.mOkHttpClient)//加入okhttp
//                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())//加入Gson工厂解析器
                        .build();
            }
        }
        return mTestRetrofit;
    }

}
