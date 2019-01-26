package com.hwq.mvvm.openfile.adapter;

import android.database.DataSetObserver;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.R;
import com.hwq.mvvm.databinding.ItemUserChildBinding;
import com.hwq.mvvm.databinding.ItemUserGroupBinding;
import com.hwq.mvvm.openfile.entity.FileEntity;

public class FileListAdapter implements ExpandableListAdapter {
    private ObservableArrayList<FileEntity> child;

    public void setChild(ObservableArrayList<FileEntity> child) {
        this.child = child;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getGroupCount() {
        return child.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        return null!=child.get(groupPosition).getChild()?child.get(groupPosition).getChild().size():0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return child.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return child.get(groupPosition).getChild().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ItemUserGroupBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_user_group, parent, false);
        binding.setVariable(BR.group, child.get(groupPosition));
        binding.executePendingBindings();
        if (isExpanded) {
            binding.ivSelect.setImageResource(R.drawable.select_up);
        } else {
            binding.ivSelect.setImageResource(R.drawable.select_down);
        }
        return binding.getRoot();
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ItemUserChildBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_user_child, parent, false);
        binding.setVariable(BR.child, child.get(groupPosition).getChild().get(childPosition));
        binding.executePendingBindings();
        return binding.getRoot();
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void onGroupExpanded(int groupPosition) {

    }

    @Override
    public void onGroupCollapsed(int groupPosition) {

    }

    @Override
    public long getCombinedChildId(long groupId, long childId) {
        return child.get(0).getChild().size();
    }

    @Override
    public long getCombinedGroupId(long groupId) {
        return 0;
    }
}
