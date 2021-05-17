package com.example.asynctaskloader;
import android.content.Context;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class getSourceLoader extends AsyncTaskLoader<String> {
    private String mQueryString;
    private String mTransferProtocol;
    public getSourceLoader(Context context, String queryString, String transferProtocol) {
        super(context);
        mQueryString = queryString;
        mTransferProtocol = transferProtocol;
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getSource(mQueryString, mTransferProtocol);
    }
}
