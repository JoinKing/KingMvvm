package com.hwq.mvvm.rxbus.vm;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.bus.RxBus;
import com.hwq.lib_common.bus.RxSubscriptions;
import com.hwq.mvvm.rxbus.RxBusEvent;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class RxbusTwoViewModel extends BaseViewModel {

    public ObservableField<String> context = new ObservableField<>("默认值");

    public BindingCommand post = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

            RxBus.getDefault().post(new RxBusEvent("我是RxTwoActivity发送过来的消息"));

        }
    });

    public RxbusTwoViewModel(@NonNull Application application) {
        super(application);
    }
    private Disposable disposable;
    @Override
    public void registerRxBus() {
        super.registerRxBus();

        disposable = RxBus.getDefault().toObservable(RxBusEvent.class).subscribe(new Consumer<RxBusEvent>() {
            @Override
            public void accept(RxBusEvent rxBusEvent) throws Exception {
                context.set(rxBusEvent.toString());
            }
        });

        RxSubscriptions.add(disposable);
    }

    @Override
    public void removeRxBus() {
        super.removeRxBus();
        RxSubscriptions.remove(disposable);
    }
}
