package com.woocer.test.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH$J\b\u0010\t\u001a\u00020\bH\u0014\u00a8\u0006\n"}, d2 = {"Lcom/woocer/test/base/ObserverDataBindingActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "Lcom/woocer/test/base/BaseDataBindingActivity;", "layoutRes", "", "(I)V", "observe", "", "onStart", "app_prodDebug"})
public abstract class ObserverDataBindingActivity<T extends androidx.databinding.ViewDataBinding> extends com.woocer.test.base.BaseDataBindingActivity<T> {
    
    public ObserverDataBindingActivity(@androidx.annotation.LayoutRes()
    int layoutRes) {
        super(0);
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    protected abstract void observe();
}