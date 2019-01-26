package com.hwq.mvvm.address;

import android.app.Activity;
import android.app.Application;
import android.support.annotation.NonNull;
import android.widget.LinearLayout;

import com.hwq.lib_common.widget.address.BottomDialog;
import com.hwq.lib_common.widget.address.bean.City;
import com.hwq.lib_common.widget.address.bean.County;
import com.hwq.lib_common.widget.address.bean.Province;
import com.hwq.lib_common.widget.address.bean.Street;
import com.hwq.lib_common.widget.address.db.manager.AddressDictManager;
import com.hwq.lib_common.widget.address.widget.AddressSelector;

import com.hwq.lib_common.widget.address.widget.OnAddressSelectedListener;
import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.ToastUtils;

public class AddressViewModel extends BaseViewModel implements OnAddressSelectedListener, AddressSelector.OnDialogCloseListener, AddressSelector.onSelectorAreaPositionListener {

    private AddressDictManager addressDictManager;

    private BottomDialog dialog;

    public AddressViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AddressSelector selector = new AddressSelector(getApplication());
        //获取地址管理数据库
        addressDictManager = selector.getAddressDictManager();

//        initAddress();
    }

    private void initAddress() {

        if (dialog != null) {
            dialog.show();
        } else {
            dialog = new BottomDialog((Activity)getLifecycleProvider());
            dialog.setOnAddressSelectedListener(this);
            dialog.setDialogDismisListener(this);
            dialog.setTextSize(14);//设置字体的大小
            dialog.setIndicatorBackgroundColor(android.R.color.holo_orange_light);//设置指示器的颜色
            dialog.setTextSelectedColor(android.R.color.holo_orange_light);//设置字体获得焦点的颜色
            dialog.setTextUnSelectedColor(android.R.color.holo_blue_light);//设置字体没有获得焦点的颜色
//            dialog.setDisplaySelectorArea("31",1,"2704",1,"2711",0,"15582",1);//设置已选中的地区
            dialog.setSelectorAreaPositionListener(this);
        }
    }

    public BindingCommand bindingCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            dialog.show();
        }
    });


    @Override
    public void onAddressSelected(Province province, City city, County county, Street street) {
        KLog.e("onAddressSelected"+province);
        KLog.e("onAddressSelected"+city);
        KLog.e("onAddressSelected"+county);
        KLog.e("onAddressSelected"+street);

    }

    @Override
    public void dialogclose() {

        if (dialog!=null){
            dialog.dismiss();
        }else {
            ToastUtils.showShort("关闭");
        }

    }
    private int provincePosition;
    private int cityPosition;
    private int countyPosition;
    private int streetPosition;
    private LinearLayout content;
    @Override
    public void selectorAreaPosition(int provincePosition, int cityPosition, int countyPosition, int streetPosition) {
        this.provincePosition = provincePosition;
        this.cityPosition = cityPosition;
        this.countyPosition = countyPosition;
        this.streetPosition = streetPosition;
        KLog.e("数据", "省份位置=" + provincePosition);
        KLog.e("数据", "城市位置=" + cityPosition);
        KLog.e("数据", "乡镇位置=" + countyPosition);
        KLog.e("数据", "街道位置=" + streetPosition);

    }
}
