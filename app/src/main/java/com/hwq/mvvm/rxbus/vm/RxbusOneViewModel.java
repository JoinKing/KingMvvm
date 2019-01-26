package com.hwq.mvvm.rxbus.vm;

import android.app.Activity;
import android.app.Application;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;

import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.bus.RxBus;
import com.hwq.lib_common.bus.RxSubscriptions;
import com.hwq.lib_common.rxpermissions.RxPermissions;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.searchfile.MimeUtils;
import com.hwq.lib_common.utils.ToastUtils;
import com.hwq.lib_common.utils.Utils;
import com.hwq.mvvm.MainActivity;
import com.hwq.mvvm.openfile.FileFragment;
import com.hwq.mvvm.cookbar.CookBarActivity;
import com.hwq.mvvm.openfile.FileListActivity;
import com.hwq.mvvm.rxbus.RxBusEvent;

import java.io.File;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class RxbusOneViewModel extends BaseViewModel {

    public ObservableField<String>content = new ObservableField<>("默认值");


    public BindingCommand send = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            RxBus.getDefault().post(new RxBusEvent("我是RxbusOneViewModel发送的事件。。。"));

        }
    });

    public BindingCommand starActivity = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
//            startActivity(RxbusTwoActivity.class);
//            startActivity(AddressActivity.class);
            String permiss[] = {"android.permission.READ_EXTERNAL_STORAGE"};
            RxPermissions rxPermissions = new RxPermissions((Activity) getLifecycleProvider());
            rxPermissions.request(permiss).subscribe(new Consumer<Boolean>() {
                @Override
                public void accept(Boolean aBoolean) throws Exception {
                    String xx = "pdf";//后缀
                    if (aBoolean){
                        try {
                            File file  = new File(MimeUtils.searchType(Utils.getContext(),xx).get(0).getPath());
                            Bundle bundle = new Bundle();
                            bundle.putString("filePath",MimeUtils.searchTypeObservable(Utils.getContext(),xx).get(0).getPath());
                            bundle.putString("tempPath",Environment.getExternalStorageDirectory().getPath());
                            KLog.e(MimeUtils.searchType((Activity)getLifecycleProvider(),xx).toString());
                            KLog.e(MimeUtils.searchType((Activity)getLifecycleProvider(),xx).size());
//                            startContainerActivity(FileFragment.class.getCanonicalName(),bundle);
                            startActivity(FileListActivity.class,null);

//                            startActivity(MainActivity.class,bundle);
//                            MimeUtils.openFile(file,MimeUtils.getMineType("pdf"),(Activity)getLifecycleProvider());

                        }catch (Exception e){
                            ToastUtils.showShort("暂无相应格式的文件");

                        }

                    }else {
                        ToastUtils.showShort("权限被拒绝");
                    }
                }
            });
            /**
             * 图片压缩
             */
//            Flowable.just(MimeUtils.searchType((Activity)getLifecycleProvider(),"jpg"))
//                    .subscribeOn(Schedulers.io())
//                    .map(new Function<List<FileBean>,List<File>>() {
//                        @Override
//                        public List<File> apply(List<FileBean> o) throws Exception {
//                            List<File>list = new ArrayList<>();
//                            for (int i = 0; i <10 ; i++) {
//                                KLog.e(i+"原文件大小："+new File(o.get(i).getPath()).length());
//                                list.add(Luban.get(Utils.getContext()).firstCompress(new File(o.get(i).getPath())));
//                            }
//                            return list;
//                        }
//                    })
//                    .compose(RxUtils.bindToLifecycle(getLifecycleProvider()))
//                    .subscribe(new Consumer<List<File>>() {
//                        @Override
//                        public void accept(List<File> o) throws Exception {
//                            for (int i = 0; i <10 ; i++) {
//                                KLog.e(i+"现在文件大小："+new File(o.get(i).getPath()).length());
//                            }
//                        }
//                    });

            /**
             * 聊天界面
             */

//            startActivity(ChatActivity.class);



        }
    });
    public BindingCommand starActivity1 = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startActivity(CookBarActivity.class);
        }
    });

    public RxbusOneViewModel(@NonNull Application application) {
        super(application);
    }

    Disposable disposable;

    @Override
    public void registerRxBus() {
        super.registerRxBus();
       Disposable disposable =  RxBus.getDefault().toObservable(RxBusEvent.class).subscribe(new Consumer<RxBusEvent>() {
            @Override
            public void accept(RxBusEvent rxBusEvent) throws Exception {
                content.set(rxBusEvent.toString());

            }
        });
       RxSubscriptions.add(disposable);
    }

    @Override
    public void removeRxBus() {
        super.removeRxBus();
        RxSubscriptions.remove(disposable);
        RxSubscriptions.clear();
        RxSubscriptions.dispose();
    }
}
